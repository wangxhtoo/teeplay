package org.teeplay.service.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.teeplay.model.account.TeeUser;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public TeeUser getUserById() {
		logger.info("UserService ======> getUserById");
		TeeUser user = new TeeUser();
		user.setId(1111111L);
		user.setName("wangxiaohui");
		user.setPassword("111111");
		return user;
	}

	@Override
	public TeeUser getUserByEmail(String email) {
		if(email.equals("wangxiaohui")){
			TeeUser user = new TeeUser();
			user.setId(1111111L);
			user.setName("wangxiaohui");
			user.setPassword("111111");
			return user;
		}
		return null;
	}

}
