package com.github.dudiao.solon.nativex.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.noear.snack.ONode;
import org.noear.solon.test.SolonTest;

/**
 * @author songyinyin
 * @since 2023/4/5 11:38
 */
@Slf4j
@SolonTest(App.class)
public class AppTest {

  @Test
  public void hello() {
    String s = """
        [
          {
            "name": "org.noear.solon.data.tran.TranExecutor",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "org.noear.solon.data.cache.CacheService",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "com.github.dudiao.solon.demo.JsonSortConfig",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ],
            "fields": [
              {
                "name": "inputFilePath"
              },
              {
                "name": "inputFileCharset"
              },
              {
                "name": "outputDir"
              }
            ]
          },
          {
            "name": "com.github.dudiao.solon.demo.JsonSortService",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "org.noear.solon.extend.impl.PropsLoaderExt",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "org.noear.solon.extend.impl.PropsConverterExt",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "org.noear.solon.extend.impl.AppClassLoaderEx",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          },
          {
            "name": "org.noear.solon.extend.impl.ResourceScannerExt",
            "methods": [
              {
                "name": "<init>",
                "parameterTypes": []
              }
            ]
          }
        ]
        """;
    ONode o = ONode.loadStr(s);
    o.forEach(on -> {
      String name = on.get("name").getString().replaceAll("\\.", "/") + ".class";
      System.out.println(name);
    });
  }
}
