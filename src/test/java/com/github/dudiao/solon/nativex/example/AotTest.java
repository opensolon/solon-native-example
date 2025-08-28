package com.github.dudiao.solon.nativex.example;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.dudiao.solon.nativex.example.service.impl.UserServiceImpl;
import org.noear.solon.Solon;
import org.noear.solon.aot.proxy.ProxyClassFileBuilder;
import org.noear.solon.core.runtime.NativeDetector;
import org.noear.solon.core.wrap.MethodWrap;

import java.lang.reflect.Method;

/**
 * @author noear 2024/10/21 created
 */
public class AotTest {
    public static void main(String[] args) throws Exception {
        System.setProperty(NativeDetector.AOT_PROCESSING, "1");

        Solon.start(App.class, args);

        StringBuilder builder = new StringBuilder();

        ProxyClassFileBuilder proxyClassFileBuilder = new ProxyClassFileBuilder();
        proxyClassFileBuilder.build(UserServiceImpl.class).writeTo(builder);
        System.out.println("------------------------------------");
        System.out.println(builder);
        System.out.println("------------------------------------");

        for (Method method : IService.class.getDeclaredMethods()) {
            if (method.getName().contains("page")) {
                MethodWrap methodWrap = Solon.app().context().methodGet(UserServiceImpl.class, method);
                methodWrap.getParamWraps();
            }
        }
    }
}
