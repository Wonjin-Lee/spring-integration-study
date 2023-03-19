package io.wonjin.springintegrationstudy;

import io.wonjin.springintegrationstudy.mail.bootstrap.Bootstrap;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class SpringIntegrationStudyApplication {

    private static Bootstrap bootstrap;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationStudyApplication.class, args);
        bootstrap.adapterOn();
    }

}
