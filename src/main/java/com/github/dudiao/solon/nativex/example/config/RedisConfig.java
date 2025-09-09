package com.github.dudiao.solon.nativex.example.config;

import io.lettuce.core.RedisClient;
import io.lettuce.solon.LettuceSupplier;
import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

/**
 *
 * @author noear 2025/9/8 created
 *
 */
@Slf4j
@Configuration
public class RedisConfig {
    @Bean
    public RedisClient demo1(@Inject("${redis.rd1}") LettuceSupplier supplier) {
        return (RedisClient) supplier.get();
    }

    @Bean
    public void test(RedisClient client) {
        client.connect();

        log.warn("test redis ok!");
    }
}
