package com.github.dudiao.solon.nativex.example.service;

import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.Component;
import org.noear.solon.scheduling.annotation.Scheduled;

/**
 * @author noear 2025/5/23 created
 */
@Slf4j
@Component
public class JobService {
    @Scheduled(fixedRate = 2000)
    public void job1() {
        log.info("job1");
    }

    @Scheduled(cron = "1/3 * * * * ? *")
    public void job2() {
        log.info("job2");
    }
}
