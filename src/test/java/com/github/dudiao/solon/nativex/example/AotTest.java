package com.github.dudiao.solon.nativex.example;

import org.noear.solon.aot.SolonAotProcessor;

/**
 * @author noear 2024/10/21 created
 */
public class AotTest {
    public static void main(String[] args) throws Throwable {
        SolonAotProcessor.main(new  String[]{
            "com.github.dudiao.solon.nativex.example.App",
            "/Users/noear/WORK/work_github/noear_admin/solon-native-example/target/classes",
            "/Users/noear/WORK/work_github/noear_admin/solon-native-example/target/solon-aot/main/sources",
            "com.dudiao.solon",
            "solon-native-example",
            "",
        });
    }
}
