package com.github.dudiao.solon.nativex.example.controller.remote;

import com.github.dudiao.solon.nativex.example.model.entity.Order;
import com.github.dudiao.solon.nativex.example.model.entity.User;
import org.noear.solon.annotation.Body;
import org.noear.solon.annotation.Consumes;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Post;
import org.noear.solon.core.util.MimeType;

/**
 * @author songyinyin
 * @since 2023/4/15 16:11
 */
public interface UserRpcService {
    @Get
    User getById(long userId);

    @Consumes(MimeType.APPLICATION_JSON_VALUE)
    @Post
    Order addOrder(@Body Order order);
}
