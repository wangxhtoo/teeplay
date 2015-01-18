package org.teeplay.service.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teeplay.dao.UserDao;
import org.teeplay.model.account.TeeUser;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public TeeUser getUserByUP(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.getUserByUP(username, password);
	}
	
	

}
