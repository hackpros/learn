/**
 * 
 * IUsersService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-10-30 Created
 */
package org.learn.boot.service;

import org.learn.boot.domain.Users;
import org.learn.boot.domain.UsersQueryHelper;

import com.navigate.treat.base.service.single.IBaseService;

public interface IUsersService extends IBaseService<Users, UsersQueryHelper> {
	
	/**
	 * 
	 * @param l
	 * @return
	 */
	Users selectById(long id);
    
}