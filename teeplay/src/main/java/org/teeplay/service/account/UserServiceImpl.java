package org.teeplay.service.account;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teeplay.dao.UserDao;
import org.teeplay.model.account.TableResource;
import org.teeplay.model.account.TableUser;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public TableUser getUserByUP(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.getUserByUP(username, password);
	}

	@Override
	public TableUser getUserByU(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByU(username);
	}

	@Override
	public long saveResource(String rescName,String rescPerm,String rescDesc,long parentId) {
		return userDao.insertResource(rescName, rescPerm, rescDesc, parentId);
	}

	@Override
	public long insertRole(String roleName, String roleDesc) {
		// TODO Auto-generated method stub
		return userDao.insertRole(roleName, roleDesc);
	}

	@Override
	public int insertRoleResource(long roleId, long resourceId) {
		// TODO Auto-generated method stub
		return userDao.insertRoleResource(roleId, resourceId);
	}

	@Override
	public int insertUserRole(long userId, long roleId) {
		// TODO Auto-generated method stub
		return userDao.insertUserRole(userId, roleId);
	}

	@Override
	public int insertUserResource(long userId, long resourceId) {
		// TODO Auto-generated method stub
		return userDao.insertUserResource(userId, resourceId);
	}

	@Override
	public List<String> getUserRescs(long userId) {
		// TODO Auto-generated method stub
		return userDao.getUserRescs(userId);
	}

	@Override
	public TableUser regist(TableUser user) {
		
		logger.info("==========注册==========");
		
		return user;
	}
	
	

}
