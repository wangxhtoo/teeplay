package org.teeplay.service.account;

import java.util.List;

import org.teeplay.model.account.TableUser;


public interface UserService {

	public TableUser getUserByUP(String username,String password);
	
	public TableUser getUserByU(String username);
	
	public long saveResource(String rescName,String rescPerm,String rescDesc,long parentId);
	
	public long insertRole(String roleName,String roleDesc);
	
	public int insertRoleResource(long roleId,long resourceId);
	
	public int insertUserRole(long userId,long roleId);
	
	public int insertUserResource(long userId,long resourceId);
	
	public List<String> getUserRescs(long userId);
	
	public TableUser regist(TableUser user);
	
}
