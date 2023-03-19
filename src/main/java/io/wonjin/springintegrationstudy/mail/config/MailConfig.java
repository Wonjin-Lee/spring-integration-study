package io.wonjin.springintegrationstudy.mail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public Properties mailProperties() {
        Properties properties = new Properties();
        properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.imap.socketFactory.fallback", "false");
        properties.setProperty("mail.store.protocol", "imaps");
        properties.setProperty("mail.debug", "true");
        properties.setProperty("mail.imap.ssl", "true");
        return properties;
    }
}
