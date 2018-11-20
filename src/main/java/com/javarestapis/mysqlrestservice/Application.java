package com.javarestapis.mysqlrestservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javarestapis.mysqlrestservice.entity.UserApi;
import com.javarestapis.mysqlrestservice.repository.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    // initially if there are no users in the table user_api, nobody can acces the endpoint;
    // either enter manually the first user or include the code below
    @Bean
    protected CommandLineRunner init(final UserRepository userRepository) {

        return args -> {
            UserApi user = new UserApi();
            user.setUsername("admin");
            user.setPassword("admin");
            user.setName("Administrator");
            user.setEmail("admin@javarestapis.com");
            userRepository.save(user);

        };
    }
}
