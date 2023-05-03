package org.ylzl.eden.demo.service.impl


import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.slf4j.Logger
import org.springframework.ui.ConcurrentModel
import org.ylzl.eden.demo.model.entity.User
import org.ylzl.eden.demo.model.mapper.UserMapper
import spock.lang.Specification
import spock.lang.Unroll

import static org.mockito.ArgumentMatchers.any
import static org.mockito.Mockito.when

class UserServiceImplTest extends Specification {
	@Mock
	UserMapper userMapper
	@Mock
	Logger log
	@InjectMocks
	UserServiceImpl userServiceImpl

	def setup() {
		MockitoAnnotations.openMocks(this)
	}

	@Unroll
	def "get User By Id where model=#model and id=#id"() {
		given:
		when(userMapper.selectById(any())).thenReturn(User.builder().id(1L).build())

		expect:
		userServiceImpl.getUserById(id, model)

		where:
		model                 | id || expectedResult
		new ConcurrentModel() | 1l || true
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
