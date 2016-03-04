/**
 * 
 * UsersController.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-10-30 Created
 */
package org.learn.boot.control;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.learn.base.contorl.BaseController;
import org.learn.base.io.request.ReqHttpHeaders;
import org.learn.boot.domain.Users;
import org.learn.boot.service.IUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "exp1")
public class UsersController extends BaseController {
	static final Logger log = Logger.getLogger(UsersController.class);

	@Resource
	private IUsersService userService;

	@RequestMapping(value = "select", method = RequestMethod.GET)
	@ResponseBody
	public ModelMap select(@Validated Users user, ReqHttpHeaders RequestHead) {

		ModelMap model = new ModelMap();
		Users users = userService.selectById(1L);
		model.addAttribute("data", users);
		return model;

	}
}