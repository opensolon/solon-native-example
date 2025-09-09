package com.github.dudiao.solon.nativex.example.controller.remote;

import com.github.dudiao.solon.nativex.example.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService
public class UserDubboServiceImpl implements UserDubboService {
    @Override
    public Order addOrder(Order order) {
        log.warn(order.toString());
        return order;
    }
}