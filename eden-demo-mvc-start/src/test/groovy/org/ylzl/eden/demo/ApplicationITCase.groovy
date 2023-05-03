package org.ylzl.eden.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.ui.ConcurrentModel
import org.ylzl.eden.demo.web.UserController
import spock.lang.Specification
import spock.lang.Unroll

/**
 * 应用启动集成测试
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationITCase extends Specification {

	@Autowired
	private UserController userController;

	@Unroll
	def "get User By Id where id=#id then expect: #expectedResult"() {
		expect:
		userController.getUserById(id, new ConcurrentModel()) == expectedResult

		where:
		id || expectedResult
		1l || "user/user-detail"
	}
}
