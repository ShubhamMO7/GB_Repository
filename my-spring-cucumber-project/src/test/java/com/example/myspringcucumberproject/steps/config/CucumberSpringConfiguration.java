package com.example.myspringcucumberproject.steps.config;

import com.example.myspringcucumberproject.MySpringCucumberProjectApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = MySpringCucumberProjectApplication.class)
public class CucumberSpringConfiguration {
}
