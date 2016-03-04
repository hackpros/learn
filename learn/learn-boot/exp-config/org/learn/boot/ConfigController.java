package org.learn.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * srping boot 配置文件例子
 * @author fwg create by  2016年3月3日 下午2:58:15
 *
 */
@Controller
public class ConfigController {
	@Autowired
	JdbcConfig jdbcConfig;

	@RequestMapping("/test")
	@ResponseBody
	public JdbcConfig String() {
		return jdbcConfig;
	}
}
