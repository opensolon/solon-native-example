package com.github.dudiao.solon.nativex.example;

import org.apache.dubbo.solon.annotation.EnableDubbo;
import org.noear.solon.Solon;
import org.noear.solon.annotation.SolonMain;
import org.noear.solon.scheduling.annotation.EnableScheduling;

@EnableDubbo
@EnableScheduling
@SolonMain
public class App {
    public static void main(String[] args) {
        Solon.start(App.class, args);
    }
}