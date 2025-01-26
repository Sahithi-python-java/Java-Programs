package com.shein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Clear the cart after checkout
        session.removeAttribute("cart");
        session.removeAttribute("prices");

        // Redirect to confirmation page
        response.sendRedirect("confirmation.jsp");
    }
}
