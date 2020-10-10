package com.zy.blog.config;

/**
 * @author zhangyue
 * @date 2020/10/8 21:03
 **/

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Configuration;

    /**
     * 自定义Redis配置类，进行序列化以及RedisTemplate设置
     */
    @Configuration
    public class RedisConfig extends CachingConfigurerSupport {

    }


