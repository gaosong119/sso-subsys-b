package com.aerotop.ssosubsysb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(value = "com.aerotop.filter")
public class SsoSubsysBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoSubsysBApplication.class, args);
    }

}
