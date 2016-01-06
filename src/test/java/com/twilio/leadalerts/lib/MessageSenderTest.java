package com.twilio.leadalerts.lib;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Account;
import org.apache.http.NameValuePair;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MessageSenderTest {
    @Mock
    private TwilioRestClient client;

    @Mock
    private Account account;

    @Mock
    private MessageFactory messageFactory;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sendSMSMessage() throws TwilioRestException {

        when(client.getAccount()).thenReturn(account);
        when(account.getMessageFactory()).thenReturn(messageFactory);

        MessageSender messageSender = new MessageSender(client);
        messageSender.send("message");

        verify(messageFactory).create(anyListOf(NameValuePair.class));
    }
}
