package com.twilio.leadalerts.lib;

import com.twilio.leadalerts.lib.config.Credentials;
import com.twilio.leadalerts.lib.config.PhoneNumbers;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class MessageSender {
    private final TwilioRestClient client;

    public MessageSender() {
        client = new TwilioRestClient(
                Credentials.getTwilioAccountSid(),
                Credentials.getTwilioAuthToken());
    }

    public MessageSender(TwilioRestClient client) {
        this.client = client;
    }

    public void send(String message) {
        List<NameValuePair> params = buildParams(message);

        try {
            client.getAccount().getMessageFactory().create(params);
        } catch (TwilioRestException exception) {
            exception.printStackTrace();
        }
    }

    private List<NameValuePair> buildParams(String message) {
        List<NameValuePair> params = new ArrayList<>();

        params.add(new BasicNameValuePair("To", PhoneNumbers.getAgentPhoneNumber()));
        params.add(new BasicNameValuePair("From", PhoneNumbers.getTwilioPhoneNumber()));
        params.add(new BasicNameValuePair("Body", message));

        return params;
    }
}
