package com.hsm.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @Auther: huangsenming
 * @Date: 2019/12/28 18:15
 * @Description:
 */
@Configuration
//@EnableWebMvc //这个主键会完全将控制spring mvc
public class MyConfig {

   /* @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional =
        HttpMessageConverter<?> another = ...
        return new HttpMessageConverters(additional, another);
    }*/
}
