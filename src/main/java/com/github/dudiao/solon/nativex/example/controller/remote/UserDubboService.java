package com.github.dudiao.solon.nativex.example.controller.remote;

import com.github.dudiao.solon.nativex.example.model.entity.Order;
import com.github.dudiao.solon.nativex.example.model.entity.User;
import org.noear.solon.annotation.Body;
import org.noear.solon.annotation.Consumes;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Post;
import org.noear.solon.core.util.MimeType;

public interface UserDubboService {
    User getById(long userId);

    Order addOrder(Order order);
}
