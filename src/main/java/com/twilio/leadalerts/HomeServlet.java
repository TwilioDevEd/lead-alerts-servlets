package com.twilio.leadalerts;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @SuppressWarnings("unused")
    public HomeServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("houseTitle", "555 Sunnybrook Lane");
        request.setAttribute("housePrice", "$349,999");
        request.setAttribute("houseDescription",
                "You and your family will love this charming home. " +
                "Featuring granite appliances, stainless steel windows, and " +
                "high efficiency dual mud rooms, this joint is loaded to the max. " +
                "Motivated sellers have priced for a quick sale, act now!");

        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
