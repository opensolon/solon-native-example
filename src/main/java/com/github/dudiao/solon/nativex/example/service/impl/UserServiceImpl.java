package com.github.dudiao.solon.nativex.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dudiao.solon.nativex.example.mapper.UserMapper;
import com.github.dudiao.solon.nativex.example.model.entity.User;
import com.github.dudiao.solon.nativex.example.service.UserService;
import org.noear.solon.annotation.Component;

import java.util.List;

/**
 * @author noear 2024/10/21 created
 */
@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> selectList(User queryEntity) {
        return this.lambdaQuery().setEntity(queryEntity).list();
    }
}
