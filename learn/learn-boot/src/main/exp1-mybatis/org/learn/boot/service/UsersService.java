package org.learn.boot.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.learn.boot.dao.UsersMapper;
import org.learn.boot.domain.Users;
import org.learn.boot.domain.UsersQueryHelper;
import org.springframework.stereotype.Service;

import com.navigate.treat.base.service.single.BaseServiceImp;

@Service
public class UsersService extends BaseServiceImp<Users, UsersQueryHelper>
		implements IUsersService {

	static final Logger log = Logger.getLogger(BaseServiceImp.class);;

	@Resource
	UsersMapper usersMapper;

	@Override
	public Users selectById(long id) {
		// TODO Auto-generated method stub
		return usersMapper.selectById(new Users(id));
	}

	

}
