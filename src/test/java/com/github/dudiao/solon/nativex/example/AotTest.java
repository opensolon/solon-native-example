package com.github.dudiao.solon.nativex.example;

import org.noear.solon.aot.SolonAotProcessor;

/**
 * @author noear 2024/10/21 created
 */
public class AotTest {
    public static void main(String[] args) throws Throwable {
        String userDir = System.getProperty("user.dir");

        SolonAotProcessor.main(new String[]{
            "com.github.dudiao.solon.nativex.example.App",
            userDir + "/target/classes",
            userDir + "/target/solon-aot/main/sources",
            "com.dudiao.solon",
            "solon-native-example",
            "",
        });
    }
}
