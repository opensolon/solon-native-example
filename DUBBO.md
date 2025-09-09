
### 1. 项目 sdk 要求

`graalvm-ce-17`  或更高

### 2. 当前运行系统变量：

系统环境变量，添加 `graalvm-ce-17` 相关内容

```shell
# Java Graalvm Native (tmp)
export PATH=/Users/noear/Library/Java/JavaVirtualMachines/graalvm-ce-17/Contents/Home/bin/:$PATH
export JAVA_HOME=/Users/noear/Library/Java/JavaVirtualMachines/graalvm-ce-17/Contents/Home
```
### 3.编译指令

```shell
mvn clean native:compile -P native -P native-dubbo -DskipTests
```