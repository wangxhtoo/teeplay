package org.teeplay.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class Dao<T> {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final String SQL_PROP_FILE_PREFIX = "/sql/";
	
	String GET_ID = "SELECT LAST_INSERT_ID() AS last_insert_id";
	
	protected Properties sqlProp;

	final static Logger logger = LoggerFactory.getLogger(Dao.class);

	public Dao(String _sqlPropFileName) {
		String sqlPropFileName = SQL_PROP_FILE_PREFIX + _sqlPropFileName;
		InputStream in = null;
		try {
			in = Dao.class.getResourceAsStream(sqlPropFileName);
			sqlProp = new Properties();
			sqlProp.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
				}
			}
		}
	}
	
}
