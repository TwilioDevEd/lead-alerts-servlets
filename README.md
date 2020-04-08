<a href="https://www.twilio.com">
  <img src="https://static0.twilio.com/marketing/bundles/marketing/img/logos/wordmark-red.svg" alt="Twilio" width="250" />
</a>

# Instant lead alerts example implemented with Java and Servlets

This demo application shows how to implement instant lead alerts using Java and
Servlets. Notify sales reps or agents right away when a new lead comes in for
a real estate listing or other high value channel.

[Read the full tutorial here](https://www.twilio.com/docs/tutorials/walkthrough/lead-alerts/java/servlets)!

![](https://github.com/TwilioDevEd/lead-alerts-servlets/workflows/Java-Gradle/badge.svg)

> We are currently in the process of updating this sample template. If you are encountering any issues with the sample, please open an issue at [github.com/twilio-labs/code-exchange/issues](https://github.com/twilio-labs/code-exchange/issues) and we'll try to help you.

## Local Development

1. Clone this repository and `cd` into its directory:
   ```bash
   $ git clone git@github.com:TwilioDevEd/lead-alerts-servlets.git
   $ cd lead-alerts-servlets
   ```

1. Copy the `.env.example` file:
   ```bash
   cp .env.example .env
   ```

   Then edit it to match your database and Twilio's configuration.

   You can find your `TWILIO_ACCOUNT_SID` and `TWILIO_AUTH_TOKEN` in your [Twilio Account Settings](https://www.twilio.com/user/account/settings).
   You will also need a `TWILIO_PHONE_NUMBER`, which you may find [here](https://www.twilio.com/user/account/phone-numbers/incoming).

1. Source the environment variables.

   ```bash
   source .env
   ```

1. Run the application.

   ```bash
   $ ./gradlew appRun
   ```

1. Check it out at [http://localhost:8080/home](http://localhost:8080/home)

That's it!

## Meta

* No warranty expressed or implied. Software is as is. Diggity.
* The CodeExchange repository can be found [here](https://github.com/twilio-labs/code-exchange/).
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly crafted by Twilio Developer Education.
