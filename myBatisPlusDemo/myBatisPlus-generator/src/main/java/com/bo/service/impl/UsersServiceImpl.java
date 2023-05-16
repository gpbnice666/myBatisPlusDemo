package com.bo.service.impl;

import com.bo.pojo.Users;
import com.bo.mapper.UsersMapper;
import com.bo.service.UsersService;
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
