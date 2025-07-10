package com.github.dudiao.solon.nativex.example.flow;

import lombok.extern.slf4j.Slf4j;
import org.noear.solon.annotation.Component;
import org.noear.solon.flow.FlowContext;
import org.noear.solon.flow.Node;
import org.noear.solon.flow.TaskComponent;

@Slf4j
@Component("ACom")
public class ACom implements TaskComponent {
    @Override
    public void run(FlowContext context, Node node) throws Throwable {
        log.warn("flow-task-test");
    }
}
