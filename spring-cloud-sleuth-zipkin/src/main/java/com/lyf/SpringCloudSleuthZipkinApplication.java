package com.lyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudSleuthZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthZipkinApplication.class, args);
    }

}
