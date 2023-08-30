package com.shao.test00;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * @author Shao
 * @date 2023/8/30 19:00
 * @description
 */

@Slf4j
@SpringBootApplication
public class Shao_Application {

    //private static final Logger log = (Logger) LoggerFactory.getLogger(Shao_Application.class);

    public static void main(String[] args) {
        log.info("1111 ----------------------------");
        SpringApplication.run(Shao_Application.class , args);
    }
}
