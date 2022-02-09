package org.ylzl.eden.demo.service;

import org.springframework.ui.Model;
import org.ylzl.eden.demo.model.entity.User;
import org.ylzl.eden.spring.framework.cola.dto.PageResponse;
import org.ylzl.eden.spring.framework.cola.dto.Response;
import org.ylzl.eden.spring.framework.cola.dto.SingleResponse;

/**
 * 用户业务逻辑接口
 *
 * @author gyl
 * @since 2.4.x
 */
public interface UserService {

	/**
	 * 获取用户信息
	 *
	 * @param id
	 * @param model
	 * @return
	 */
	void getUserById(Long id, Model model);
}
