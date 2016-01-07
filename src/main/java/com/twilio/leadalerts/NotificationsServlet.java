package com.twilio.leadalerts;

import com.twilio.leadalerts.lib.MessageSender;
import com.twilio.sdk.TwilioRestException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NotificationsServlet extends HttpServlet {

    private final MessageSender messageSender;

    @SuppressWarnings("unused")
    public NotificationsServlet() {
        this(new MessageSender());
    }

    public NotificationsServlet(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String houseTitle = request.getParameter("houseTitle");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String message = request.getParameter("message");

        String formattedMessage = formatMessage(houseTitle, name, phone, message);
        try {
            messageSender.send(formattedMessage);
            request.setAttribute("success", "Thanks! An agent will be contacting you shortly.");
        } catch (TwilioRestException e) {
            e.printStackTrace();
            request.setAttribute("error", "Oops! There was an error. Please try again.");
        }

        request.getRequestDispatcher("home.jsp").forward(request, response);
    }


    private String formatMessage(String houseTitle, String name, String phone, String message) {
        return String.format("New lead received for %s. Call %s at %s. Message: %s",
                houseTitle, name, phone, message);
    }
}
