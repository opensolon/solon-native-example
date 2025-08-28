package com.github.dudiao.solon.nativex.example.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.ibatis.solon.annotation.Db;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;

/**
 * @author songyinyin
 * @since 2023/5/27 11:30
 */
@Configuration
public class MybatisConfig {
  @Bean
  public void db1_cfg(@Db("db1") MybatisConfiguration cfg,
                      @Db("db1") GlobalConfig globalConfig) {
    MybatisPlusInterceptor plusInterceptor = new MybatisPlusInterceptor();
    plusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));

    cfg.setCacheEnabled(false);
    cfg.addInterceptor(plusInterceptor);
  }
}
