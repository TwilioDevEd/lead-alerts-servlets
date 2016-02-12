# Instant lead alerts example implemented with Java and Servlets

This demo application shows how to implement instant lead alerts using Java and
Servlets. Notify sales reps or agents right away when a new lead comes in for
a real estate listing or other high value channel.

[![Build Status](https://travis-ci.org/TwilioDevEd/lead-alerts-servlets.svg)](https://travis-ci.org/TwilioDevEd/lead-alerts-servlets)

## Local Development

1. Clone this repository and `cd` into its directory:
   ```bash
   $ git clone git@github.com:TwilioDevEd/lead-alerts-servlets.git
   $ cd lead-alerts-servlets
   ```

1. Export the environment variables:

   You can find the `AccountSID` and the `AuthToken` at https://www.twilio.com/user/account/settings.
   ```bash
   $ export TWILIO_ACCOUNT_SID=Your Twilio Account SID
   $ export TWILIO_AUTH_TOKEN=Your Twilio Auth Token
   $ export TWILIO_PHONE_NUMBER=Your Twilio Phone Number
   $ export AGENT_PHONE_NUMBER=The Agent's Phone Number
   ```

1. Run the application.
   ```bash
   $ ./gradlew jettyRun
   ```

1. Check it out at [http://localhost:8080/home](http://localhost:8080/home)

That's it!

## Meta

* No warranty expressed or implied. Software is as is. Diggity.
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly crafted by Twilio Developer Education.
