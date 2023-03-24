package com.tobyspring.config;

import com.tobyspring.connection.ConnectionMaker;
import com.tobyspring.connection.DConnectionMaker;
import com.tobyspring.user.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
