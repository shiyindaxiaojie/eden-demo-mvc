package org.ylzl.eden.demo.service;

import org.springframework.ui.Model;

/**
 * 用户业务逻辑接口
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
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
