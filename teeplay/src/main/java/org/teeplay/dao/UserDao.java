package org.teeplay.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.teeplay.model.account.TeeUser;

@Component
public class UserDao extends Dao{
	
	protected static String sqlPropFileName = "account.properties";
	
	public UserDao() {
		super(sqlPropFileName);
	}
	public UserDao(String _sqlPropFileName) {
		super(_sqlPropFileName);
	}
	public enum SQL {
		GET_USER_BY_USERNAME_PASSWORD
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	* @author: wangxh
	* @Title: getUserByUP
	* @Description: TODO(根据用户名和密码查询用户信息)
	* @param @param username
	* @param @param password
	* @param @return    设定文件
	* @return TeeUser    返回类型
	* @throws
	 */
	public TeeUser getUserByUP(String username,String password){
		return jdbcTemplate.query(sqlProp.getProperty(SQL.GET_USER_BY_USERNAME_PASSWORD.toString()),
				new Object[] {username,password},new ResultSetExtractor<TeeUser>(){
			@Override
			public TeeUser extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				while (rs.next()) {
					TeeUser user = new TeeUser();
					user.setId(rs.getLong(TeeUser.User.id.toString()));
					user.setName(rs.getString(TeeUser.User.username.toString()));
					user.setPassword(rs.getString(TeeUser.User.password.toString()));
					user.setCreateTime(rs.getTimestamp(TeeUser.User.createdate.toString()));
					return user;
				}
				return null;
			}
			
		});
	}

}
