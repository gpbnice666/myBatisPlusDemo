package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HM
 * @since 2019-06-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
