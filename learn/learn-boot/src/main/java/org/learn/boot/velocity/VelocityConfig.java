package org.learn.boot.velocity;

import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

@Configuration
public class VelocityConfig {

	@Bean
	// 现在这个class不再是layout的，所以要把对应的 ViewResolver改成对应的，由于没有
	// toolboxviewresolver，就用父类 veclotiyviewresoler
	public VelocityViewResolver velocityViewResolver(VelocityProperties properties) {
		VelocityViewResolver viewResolver = new VelocityViewResolver();
		//viewResolver.setPrefix("");
		//viewResolver.set
//		# VELOCITY TEMPLATES (VelocityAutoConfiguration)
//		spring.velocity.allow-request-override=false
//		spring.velocity.cache=true
//		spring.velocity.check-template-location=true
//		spring.velocity.charset=UTF-8
//		spring.velocity.content-type=text/html
//		spring.velocity.date-tool-attribute=
//		spring.velocity.expose-request-attributes=false
//		spring.velocity.expose-session-attributes=false
//		spring.velocity.expose-spring-macro-helpers=false
//		spring.velocity.number-tool-attribute=
//		spring.velocity.prefer-file-system-access=true # prefer file systemaccess for template loading
//		spring.velocity.prefix=
//		spring.velocity.properties.*=
//		spring.velocity.request-context-attribute=
//		spring.velocity.resource-loader-path=classpath:/templates/
//		spring.velocity.suffix=.vm
//		spring.velocity.toolbox-config-location= # velocity Toolbox configlocation, for example "/WEB-INF/toolbox.xml"
//		spring.velocity.view-names= # whitelist of view names that can beresolved
		
		
		viewResolver.setViewClass(VelocityLayoutToolboxView.class);
		properties.applyToViewResolver(viewResolver);// 设置默认属性，比如前缀和后缀
		return viewResolver;
	}

}