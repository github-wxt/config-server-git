package com.wxt.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 〈类描述〉
 * 〈〉
 *
 * @author 67563
 * @create 2021/6/7
 * @since 1.0.0
 */

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConfigServerGitApplication.class,args);
        new SpringApplicationBuilder(ConfigServerGitApplication.class).web(true).run(args);
    }
}
