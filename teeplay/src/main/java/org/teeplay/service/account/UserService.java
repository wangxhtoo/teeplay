package org.teeplay.service.account;

import org.teeplay.model.account.TeeUser;


public interface UserService {
	
	public TeeUser getUserById();
	
	public TeeUser getUserByEmail(String email);

}
