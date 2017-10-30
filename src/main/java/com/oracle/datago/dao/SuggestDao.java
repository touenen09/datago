package com.oracle.datago.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Suggest;

public class SuggestDao extends BaseDao {

	private static Logger logger = Logger.getLogger(SuggestDao.class);
	private static String SELECT_SUGGEST = "SELECT consequent, MAX(lift) FROM suggestion WHERE antecedent in (KEYWORDS) AND consequent not in (KEYWORDS) and rownum <= 10 GROUP BY consequent ORDER BY MAX(lift) DESC";

	public List<Suggest> getSuggests(List<String> keywords) {
		List<Suggest> out = new LinkedList<Suggest>();
		if (keywords == null || keywords.isEmpty()) {
			return out;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < keywords.size(); i++) {
			String keyword = keywords.get(i);
			sb.append("'");
			sb.append(keyword.toUpperCase());
			sb.append("'");
			if (i < (keywords.size() - 1)) {
				sb.append(",");
			}
		}
		String sql = SELECT_SUGGEST.replaceAll("KEYWORDS", sb.toString());
		logger.debug(sql);

		logger.debug("get suggests");
		Connection connection = null;
		try {
			connection = super.getOaaConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Suggest suggest = new Suggest();
				suggest.setAssociatedKeyword(rs.getString(1));
				suggest.setScore(rs.getDouble(2));
				out.add(suggest);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		logger.debug("get suggests done");
		return out;
	}

	public static void main(String[] args) {
		List<String> keywords = new LinkedList<String>();
		keywords.add("super");
		keywords.add("database");
		List<Suggest> suggests = new SuggestDao().getSuggests(keywords);
		System.out.println(suggests);
	}
}
