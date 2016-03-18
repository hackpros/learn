/**
 * 
 * UsersController.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-10-30 Created
 */
package org.learn.boot.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.learn.base.contorl.BaseController;
import org.learn.base.io.request.ReqHttpHeaders;
import org.learn.boot.domain.Users;
import org.learn.boot.domain.UsersQueryHelper;
import org.learn.boot.service.IUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "exp1/")
public class UsersController extends BaseController {
	static final Logger log = Logger.getLogger(UsersController.class);

	@Resource
	private IUsersService userService;

	/**
	 * 注册
	 * 
	 * @param user
	 * @param RequestHead
	 * @return
	 */
	@RequestMapping(value = "create", method = RequestMethod.GET)
	@ResponseBody
	public ModelMap reg(@Validated Users user, ReqHttpHeaders RequestHead) {

		ModelMap model = new ModelMap();
		long row = userService.insertSelective(user);
		model.addAttribute("msg", row > 0 ? "注册成功" : "注册失败");
		return model;

	}

	@RequestMapping("hello")
	public String hello(Map<String, Object> model) {
		List<String> l = new ArrayList<String>();
		l.add("哈喽，hadoop");
		l.add("哈喽，hbase");
		l.add("哈喽，hive");
		l.add("哈喽，pig");
		l.add("哈喽，zookeeper");
		l.add("哈喽，三劫散仙");
		// 将数据存放map里面，可以直接在velocity页面，使用key访问
		model.put("data", l);

		return "hello";
	}

	/**
	 * 查询
	 * 
	 * @param user
	 * @param RequestHead
	 * @return
	 */

	@RequestMapping(value = "read", method = RequestMethod.GET)
	@ResponseBody
	public ModelMap select(@Validated Users user, ReqHttpHeaders RequestHead) {

		ModelMap model = new ModelMap();
		Users users = userService.selectById(1L);
		model.addAttribute("data", users);
		return model;

	}

	/**
	 * 删除
	 * 
	 * @param user
	 * @param RequestHead
	 * @return
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	@ResponseBody
	public ModelMap login(@Validated Users user, ReqHttpHeaders RequestHead) {

		ModelMap model = new ModelMap();
		UsersQueryHelper e = new UsersQueryHelper();
		long count = userService.countByExample(e);
		if (count == 0) {
			model.addAttribute("msg", "用记名或密错误!");
		} else {
			model.addAttribute("msg", "欢迎:");
		}
		return model;
	}

	/**
	 * 修改
	 * 
	 * @param user
	 * @param RequestHead
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	@ResponseBody
	public ModelMap forget(@Validated Users user, ReqHttpHeaders RequestHead) {

		ModelMap model = new ModelMap();
		Users t = new Users();
		UsersQueryHelper e = new UsersQueryHelper();
		int row = userService.updateByExample(t, e);
		if (row > 1) {
			model.addAttribute("msg", "找回密码成功");
		} else {
			model.addAttribute("msg", "找回密码失败");
		}
		return model;

	}
}