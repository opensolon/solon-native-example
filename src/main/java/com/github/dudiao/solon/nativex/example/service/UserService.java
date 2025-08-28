package com.github.dudiao.solon.nativex.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.dudiao.solon.nativex.example.model.entity.User;

import java.util.List;

/**
 * @author noear 2024/10/21 created
 */
public interface UserService extends IService<User> {
    List<User> selectList(User queryEntity);
}
