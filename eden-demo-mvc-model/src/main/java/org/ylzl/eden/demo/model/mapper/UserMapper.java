package org.ylzl.eden.demo.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ylzl.eden.demo.model.entity.User;

/**
 * 用户信息表数据库映射
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
