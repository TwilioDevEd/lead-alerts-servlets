package com.twilio.leadalerts.lib.config;

public class PhoneNumbers {
    public static String getTwilioPhoneNumber() {
        return System.getenv("TWILIO_PHONE_NUMBER");
    }

    public static String getAgentPhoneNumber() {
        return System.getenv("PHONE_PHONE_NUMBER");
    }
}
