package com.mms.wt.wt;

import com.mms.wt.wt.repositories.UserRepositorie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepositorie.class)
public class WtApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtApplication.class, args);
    }

}
