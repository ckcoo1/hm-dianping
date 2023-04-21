package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://43.142.26.119:6379")
                .setPassword("123456");
        return Redisson.create(config);
    }

//    @Bean
//    public RedissonClient redissonClient2() {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://43.142.26.119:6380");
//        return Redisson.create(config);
//    }
//
//    @Bean
//    public RedissonClient redissonClient3() {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://43.142.26.119:6391");
//        return Redisson.create(config);
//    }
}
