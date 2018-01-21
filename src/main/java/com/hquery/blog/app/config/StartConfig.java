package com.hquery.blog.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/** 
 * @ClassName: StartConfig 
 * @Description: 启动加载
 */
@Configuration
@ComponentScan(basePackages = {"com.hquery.blog"})
@Import(value = {
		PropertyConfig.class,
		DataSourceConfig.class,
})
public class StartConfig {
	
	/*@Bean
	public JettyEmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        return factory;
    }*/
}
