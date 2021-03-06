/**
 * 
 * UsersMapper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-10-30 Created
 */
package org.learn.boot.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.learn.boot.domain.Users;
import org.learn.boot.domain.UsersQueryHelper;

import com.navigate.treat.base.mapper.single.BaseMapper;
/**
 * users表操纵对象
 * @author Administrator
 *
 */
public interface UsersMapper extends BaseMapper<Users, UsersQueryHelper> {
	
	@Select("select * from users where id=1")
	@ResultType(Users.class)
	Users selectById(Users users);
	
	
	
}