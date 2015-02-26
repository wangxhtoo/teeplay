package org.teeplay.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.teeplay.model.account.TableResource;
import org.teeplay.model.account.TableUser;

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
		GET_USER_BY_USERNAME_PASSWORD,
		GET_USER_BY_USERNAME,
		INSERT_RESOURCE,
		INSERT_ROLE,
		INSERT_ROLE_RESOURCE,
		INSERT_USER_ROLE,
		INSERT_USER_RESOURCE,
		GET_USER_RESOURCE
	}
	
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
	public TableUser getUserByUP(String username,String password){
		return jdbcTemplate.query(sqlProp.getProperty(SQL.GET_USER_BY_USERNAME_PASSWORD.toString()),
				new Object[] {username,password},new ResultSetExtractor<TableUser>(){
			@Override
			public TableUser extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				while (rs.next()) {
					TableUser user = new TableUser();
					user.setId(rs.getLong(TableUser.User.id.toString()));
					user.setName(rs.getString(TableUser.User.username.toString()));
					user.setPassword(rs.getString(TableUser.User.password.toString()));
					user.setCreateTime(rs.getTimestamp(TableUser.User.createdate.toString()));
					return user;
				}
				return null;
			}
			
		});
	}
	
	public TableUser getUserByU(String username){
		return jdbcTemplate.query(sqlProp.getProperty(SQL.GET_USER_BY_USERNAME.toString()),
				new Object[] {username},new ResultSetExtractor<TableUser>(){
			@Override
			public TableUser extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				while (rs.next()) {
					TableUser user = new TableUser();
					user.setId(rs.getLong(TableUser.User.id.toString()));
					user.setName(rs.getString(TableUser.User.username.toString()));
					user.setPassword(rs.getString(TableUser.User.password.toString()));
					user.setCreateTime(rs.getTimestamp(TableUser.User.createdate.toString()));
					return user;
				}
				return null;
			}
			
		});
	}
	
	public long insertResource(String rescName,String rescPerm,String rescDesc,long parentId){
		jdbcTemplate.update(sqlProp.getProperty(SQL.INSERT_RESOURCE.toString()), rescName,rescPerm,rescDesc,parentId,new Date());
		return jdbcTemplate.queryForLong(GET_ID);
	}
	
	public long insertRole(String roleName,String roleDesc){
		jdbcTemplate.update(sqlProp.getProperty(SQL.INSERT_ROLE.toString()), roleName,roleDesc,new Date());
		return jdbcTemplate.queryForLong(GET_ID);
	}
	
	public int insertRoleResource(long roleId,long resourceId){
		return jdbcTemplate.update(sqlProp.getProperty(SQL.INSERT_ROLE_RESOURCE.toString()), roleId,resourceId);
	}
	
	public int insertUserRole(long userId,long roleId){
		return jdbcTemplate.update(sqlProp.getProperty(SQL.INSERT_USER_ROLE.toString()), userId,roleId);
	}
	
	public int insertUserResource(long userId,long resourceId){
		return jdbcTemplate.update(sqlProp.getProperty(SQL.INSERT_USER_RESOURCE.toString()), userId,resourceId);
	}
	
	public List<String> getUserRescs(long userId){
		List<String> userRescs = new ArrayList<String>();
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sqlProp.getProperty(SQL.GET_USER_RESOURCE.toString()),userId,userId);
		if(list!=null && list.size()>0){
			for(Map<String, Object> tr : list){
				userRescs.add(tr.get("resource_permission").toString());
			}
		}
		return userRescs;
	}
}
