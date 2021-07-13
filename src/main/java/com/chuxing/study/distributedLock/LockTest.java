package com.chuxing.study.distributedLock;

import com.chuxing.study.distributedLock.redis.RedisLock;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @date 2021/7/8
 * @author chenguang
 * @desc 分布式锁测试类
 */
@Component
public class LockTest implements ApplicationRunner {

    @Resource
    private RedisLock redisLock;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[基于Redis的分布式锁]");
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while(true) {
                    if (redisLock.lock("test")) {
                        System.out.println(String.format("%s get lock", Thread.currentThread().getName()));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        redisLock.unLock("test");
                        break;
                    }
                }
            }).start();
        }
    }

}
