package io.wonjin.springintegrationstudy.mail.activator;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

@Component
public class MailActivator {

    @ServiceActivator(inputChannel = "mailInputChannel")
    public void handleMessage(MimeMessage message) throws MessagingException, IOException {
        System.out.println("### Message Received!!!");
        System.out.println("### " + message.getSubject());
        System.out.println("### " + message.getFrom()[0]);
        System.out.println("### " + message.getContent().toString());
    }
}
