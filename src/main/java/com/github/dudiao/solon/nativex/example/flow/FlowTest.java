package com.github.dudiao.solon.nativex.example.flow;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Init;
import org.noear.solon.annotation.Inject;
import org.noear.solon.flow.FlowEngine;

/**
 * @author noear 2025/7/10 created
 */
@Component
public class FlowTest {
    @Inject
    FlowEngine flowEngine;

    @Init
    public void init() {
        flowEngine.eval("c1");
    }
}