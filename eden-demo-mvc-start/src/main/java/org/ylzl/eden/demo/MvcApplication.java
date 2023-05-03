package org.ylzl.eden.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.ylzl.eden.spring.boot.bootstrap.SpringBootApplicationHelper;
import org.ylzl.eden.spring.framework.web.rest.annotation.EnableRestExceptionHandler;


/**
 * Spring Boot 引导类
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
 */
@EnableRestExceptionHandler
@EnableTransactionManagement
@Slf4j
@SpringBootApplication
public class MvcApplication {

	/**
	 * 启动入口
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		SpringBootApplicationHelper.run(MvcApplication.class, args, WebApplicationType.SERVLET);
	}
}
