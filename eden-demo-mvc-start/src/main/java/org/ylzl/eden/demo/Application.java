package org.ylzl.eden.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.ylzl.eden.spring.framework.bootstrap.SpringBootApplicationTemplate;
import org.ylzl.eden.spring.framework.cola.rest.autoconfigure.EnableRestExceptionResolver;

/**
 * Spring Boot 引导类
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.x
 */
@EnableRestExceptionResolver
@MapperScan(basePackages = "org.ylzl.eden.demo.model.mapper", annotationClass = Mapper.class)
@EnableTransactionManagement
@Slf4j
@SpringBootApplication
public class Application extends SpringBootApplicationTemplate {

	/**
	 * 启动入口
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		run(Application.class, args, WebApplicationType.SERVLET);
	}
}
