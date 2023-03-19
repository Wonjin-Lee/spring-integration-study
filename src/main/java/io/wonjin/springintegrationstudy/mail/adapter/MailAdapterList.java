package io.wonjin.springintegrationstudy.mail.adapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.integration.mail.ImapIdleChannelAdapter;

import java.util.List;

@Configuration
public class MailAdapterList {
    private static List<ImapIdleChannelAdapter> onAdapters;

    public void add(ImapIdleChannelAdapter adapter) {
        onAdapters.add(adapter);
    }
}
