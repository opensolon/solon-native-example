package com.github.dudiao.solon.nativex.example.controller;

import com.github.dudiao.solon.nativex.example.controller.remote.UserDubboService;
import com.github.dudiao.solon.nativex.example.model.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;

import java.util.Date;

/**
 * @author songyinyin
 * @since 2023/4/14 14:34
 */
@Controller
public class TestController {
    @DubboReference
    private UserDubboService userDubboService;

    @Mapping("/dubbo/test")
    public Order dubboTest() {
        return userDubboService.addOrder(new Order().orderId(12).created(new Date()));
    }
}
