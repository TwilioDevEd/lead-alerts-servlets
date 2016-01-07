package com.twilio.leadalerts;

import com.twilio.leadalerts.lib.MessageSender;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class NotificationsServletTest {
    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    MessageSender messageSender;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoPost() throws Exception {

        when(request.getParameter("houseTitle")).thenReturn("house-title");
        when(request.getParameter("name")).thenReturn("name");
        when(request.getParameter("phone")).thenReturn("phone");
        when(request.getParameter("message")).thenReturn("message");

        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);

        NotificationsServlet servlet = new NotificationsServlet(messageSender);
        servlet.doPost(request, response);

        String formattedMessage = "New lead received for house-title. Call name at phone. Message: message";
        verify(messageSender).send(formattedMessage);

        verify(request).getRequestDispatcher("home.jsp");
    }
}
