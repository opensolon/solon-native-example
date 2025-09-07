package com.github.dudiao.solon.nativex.example.controller.remote;

import com.github.dudiao.solon.nativex.example.model.entity.Order;
import com.github.dudiao.solon.nativex.example.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.*;
import org.noear.solon.core.util.MimeType;

/**
 * @author songyinyin
 * @since 2023/4/15 16:12
 */
@Slf4j
@Remoting
@Mapping("/rpc/v1/user")
public class UserRpcServiceImpl implements UserRpcService {
    @Get
    @Override
    public User getById(long userId) {
        User user = new User();
        user.setWxid(String.valueOf(userId));
        user.setName("dudiao");
        return user;
    }

    @Consumes(MimeType.APPLICATION_JSON_VALUE)
    @Post
    @Override
    public Order addOrder(Order order) {
        log.warn(order.toString());
        return order;
    }
}
