package com.twilio.leadalerts.lib;

import com.twilio.http.TwilioRestClient;
import com.twilio.leadalerts.lib.config.Credentials;
import com.twilio.leadalerts.lib.config.PhoneNumbers;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

@SuppressWarnings("unused")
public class MessageSender {
    private final TwilioRestClient client;

    public MessageSender() {
        client = new TwilioRestClient.Builder(
                Credentials.getTwilioAccountSid(),
                Credentials.getTwilioAuthToken()).build();
    }

    public MessageSender(TwilioRestClient client) {
        this.client = client;
    }

    public void send(String message) {
        new MessageCreator(
                new PhoneNumber(PhoneNumbers.getAgentPhoneNumber()),
                new PhoneNumber(PhoneNumbers.getTwilioPhoneNumber()),
                message
        ).create(client);
    }

}
