package com.hquery.blog;

import com.hquery.blog.app.config.StartConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hquery
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { StartConfig.class })
@Configurable
@EnableAsync
@EnableScheduling
@EnableAutoConfiguration(exclude={
		DataSourceAutoConfiguration.class, //禁用数据源自动创建,改为XML
		LiquibaseAutoConfiguration.class,
		AopAutoConfiguration.class,
		SecurityAutoConfiguration.class
})
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
