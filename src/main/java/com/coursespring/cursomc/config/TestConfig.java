package com.coursespring.cursomc.config;

import com.coursespring.cursomc.services.DBService;
import com.coursespring.cursomc.services.EmailService;
import com.coursespring.cursomc.services.MockEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public boolean instanteateDatabase() throws ParseException {
        dbService.instantiateTesteDatabase();

        return true;
    }

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
