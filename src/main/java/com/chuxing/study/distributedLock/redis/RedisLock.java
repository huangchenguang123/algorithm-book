package com.chuxing.study.distributedLock.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.Duration;

/**
 * @date 2021/7/8
 * @author chenguang
 * @desc redis实现分布式锁
 */
@Component
public class RedisLock {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * @date 2021/7/8
     * @author chenguang 
     * @desc 尝试获取分布式锁
     */
    public Boolean lock(String key) {
        return stringRedisTemplate.opsForValue().setIfAbsent(key, key, Duration.ofSeconds(10));
    }

    /**
     * @date 2021/7/8
     * @author chenguang
     * @desc 尝试释放分布式锁
     */
    public Boolean unLock(String key) {
        return stringRedisTemplate.delete(key);
    }

}
