package com.github.dudiao.solon.nativex.example.service.impl;

import cn.hutool.core.date.DateUtil;
import com.github.dudiao.solon.nativex.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.Component;
import org.noear.solon.data.annotation.Cache;

/**
 * @author songyinyin
 * @since 2023/4/15 14:36
 */
@Slf4j
@Component
public class TestServiceImpl implements TestService {
    @Override
    @Cache(key = "test::say::${msg}")
    public String say(String msg) {
        return "I want say: " + msg + ", now: " + DateUtil.now();
    }
}
