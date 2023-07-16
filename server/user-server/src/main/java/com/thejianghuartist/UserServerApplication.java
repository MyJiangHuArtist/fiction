package com.thejianghuartist;

import com.thejianghuartist.dto.LoginInfoDTO;
import com.thejianghuartist.util.Validation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class UserServerApplication {
    public static void main(String[] args) {
        new Validation().parseObjectParameterEntry(LoginInfoDTO.class);
    }
}
