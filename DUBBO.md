
### 1、相关代码说明

* com.github.dudiao.solon.nativex.example.controller.remote.UserDubboService #接口
* com.github.dudiao.solon.nativex.example.controller.remote.UserDubboServiceImpl #实现
* com.github.dudiao.solon.nativex.example.controller.TestController #测试引用
* app.yml #配置

（非原生编译）正常运行后，可用此地址查看效果：

```http request
GET http://localhost:8080/dubbo/test
```

### 2、操作说明参考

* 项目 sdk 要求

`graalvm-ce-17`  或更高

* 当前运行系统变量：

系统环境变量，添加 `graalvm-ce-17` 相关内容

```shell
# Java Graalvm Native (tmp)
export PATH=/Users/noear/Library/Java/JavaVirtualMachines/graalvm-ce-17/Contents/Home/bin/:$PATH
export JAVA_HOME=/Users/noear/Library/Java/JavaVirtualMachines/graalvm-ce-17/Contents/Home
```
* 原生编译指令（会出错，提示缺少 Spring 相关的类）

```shell
mvn clean native:compile -P native -P native-dubbo -DskipTests
```

### 3、（如果成功）效果测试

jvm 环境是 ok 的。

```http request
GET http://localhost:8080/dubbo/test
```