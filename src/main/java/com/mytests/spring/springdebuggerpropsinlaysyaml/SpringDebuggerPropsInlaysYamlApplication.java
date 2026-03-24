package com.mytests.spring.springdebuggerpropsinlaysyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringDebuggerPropsInlaysYamlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDebuggerPropsInlaysYamlApplication.class, args);
    }

}
