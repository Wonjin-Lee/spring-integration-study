package io.wonjin.springintegrationstudy.mail.bootstrap;

import io.wonjin.springintegrationstudy.mail.adapter.MailAdapterList;
import io.wonjin.springintegrationstudy.mail.channel.MailInputChannel;
import io.wonjin.springintegrationstudy.mail.config.MailConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.integration.mail.ImapIdleChannelAdapter;
import org.springframework.integration.mail.ImapMailReceiver;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Bootstrap {

    private final MailAdapterList adapterList;
    private final MailConfig config;
    private final MailInputChannel inputChannel;

    public void adapterOn() {
        ImapMailReceiver imapMailReceiver = new ImapMailReceiver("imaps://leewonjin317:gofl0675~!@imap.gmail.com:993/inbox");
        imapMailReceiver.setJavaMailProperties(config.mailProperties());
        imapMailReceiver.setShouldMarkMessagesAsRead(false);
        imapMailReceiver.setShouldDeleteMessages(false);
        imapMailReceiver.afterPropertiesSet();
        ImapIdleChannelAdapter imapIdleChannelAdapter = new ImapIdleChannelAdapter(imapMailReceiver);
        imapIdleChannelAdapter.setAutoStartup(true);
        imapIdleChannelAdapter.setOutputChannel(inputChannel);
        imapIdleChannelAdapter.afterPropertiesSet();

        adapterList.add(imapIdleChannelAdapter);
    }
}
