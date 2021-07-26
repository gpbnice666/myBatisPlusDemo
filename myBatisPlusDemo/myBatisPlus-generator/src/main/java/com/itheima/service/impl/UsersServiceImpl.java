package com.itheima.service.impl;

import com.itheima.pojo.Users;
import com.itheima.mapper.UsersMapper;
import com.itheima.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HM
 * @since 2021-07-07
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
