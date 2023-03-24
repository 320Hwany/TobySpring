package com.tobyspring.config;

import com.tobyspring.connection.ConnectionMaker;
import com.tobyspring.connection.CountingConnectionMaker;
import com.tobyspring.connection.DConnectionMaker;
import com.tobyspring.user.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new DConnectionMaker();
    }
}
