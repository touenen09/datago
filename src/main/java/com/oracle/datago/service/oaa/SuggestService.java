package com.oracle.datago.service.oaa;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

import com.oracle.datago.dao.SuggestDao;
import com.oracle.datago.model.Suggest;
import com.oracle.datago.util.LuceneUtils;

public class SuggestService {

	private static Logger logger = Logger.getLogger(SuggestService.class);
	private Analyzer analyzer = new StandardAnalyzer();
	private SuggestDao suggestDao = new SuggestDao();

	public List<Suggest> getSuggests(String q) {
		List<String> keywords = LuceneUtils.parseKeywords(analyzer, q);
		logger.debug("keywords:" + keywords);
		return suggestDao.getSuggests(keywords);
	}

	public static void main(String[] args) {

		Analyzer analyzer = new StandardAnalyzer();
		List<String> res = LuceneUtils.parseKeywords(analyzer, "which Database is the bESt?");
		System.out.println(res);
		List<String> res1 = LuceneUtils.parseKeywords(analyzer, "データベース");
		System.out.println(res1);

	}
}
