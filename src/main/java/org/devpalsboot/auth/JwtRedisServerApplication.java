package org.devpalsboot.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtRedisServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtRedisServerApplication.class, args);
    }

}
