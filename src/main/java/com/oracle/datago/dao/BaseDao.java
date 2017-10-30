package com.oracle.datago.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.oracle.datago.util.Config;

public class BaseDao {
	
	private static DruidDataSource logDatasource;
	private static DruidDataSource oaaDatasource;

	public static Connection getLogConnection() throws SQLException {
		if (logDatasource == null) {
			logDatasource = new DruidDataSource();
			logDatasource.setUrl(Config.getValue("logdb.url"));
			logDatasource.setUsername(Config.getValue("logdb.username"));
			logDatasource.setPassword(Config.getValue("logdb.password"));
			logDatasource.setInitialSize(Integer.parseInt(Config.getValue("logdb.initSize")));
			logDatasource.setMaxActive(Integer.parseInt(Config.getValue("logdb.maxSize")));
		}
		return logDatasource.getConnection();
	}
	
	public static Connection getOaaConnection() throws SQLException {
		if (oaaDatasource == null) {
			oaaDatasource = new DruidDataSource();
			oaaDatasource.setUrl(Config.getValue("oaadb.url"));
			oaaDatasource.setUsername(Config.getValue("oaadb.username"));
			oaaDatasource.setPassword(Config.getValue("oaadb.password"));
			oaaDatasource.setInitialSize(Integer.parseInt(Config.getValue("oaadb.initSize")));
			oaaDatasource.setMaxActive(Integer.parseInt(Config.getValue("oaadb.maxSize")));
		}
		return oaaDatasource.getConnection();
	}
}
