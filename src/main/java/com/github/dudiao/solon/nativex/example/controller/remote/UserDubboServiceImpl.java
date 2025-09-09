package com.github.dudiao.solon.nativex.example.controller.remote;

import com.github.dudiao.solon.nativex.example.model.entity.Order;
import com.github.dudiao.solon.nativex.example.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.noear.solon.annotation.*;
import org.noear.solon.core.util.MimeType;

@Slf4j
@DubboService
public class UserDubboServiceImpl implements UserDubboService {
    @Override
    public User getById(long userId) {
        User user = new User();
        user.setWxid(String.valueOf(userId));
        user.setName("dudiao");
        return user;
    }

    @Override
    public Order addOrder(Order order) {
        log.warn(order.toString());
        return order;
    }
}