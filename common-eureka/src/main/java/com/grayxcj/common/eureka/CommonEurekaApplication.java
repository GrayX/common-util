package com.grayxcj.common.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :GrayX
 */
@SpringBootApplication
@EnableEurekaServer
public class CommonEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonEurekaApplication.class);

        Logger logger = LoggerFactory.getLogger(CommonEurekaApplication.class);
        logger.info("测试log=====");

        for (int i = 0; i < 10; i++) {
            logger.error("something wrong. id={}; name=Ryan-{};", i, i);
        }
        for (int i = 100; i < 110; i++) {
            logger.info("something info. id={}; name=Ryan-{};", i, i);
        }
    }
}
