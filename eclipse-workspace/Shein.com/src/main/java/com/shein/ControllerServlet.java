package com.shein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Any initialization code if required
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); // Forward GET requests to doPost for uniform handling
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("myUsername");
        String password = request.getParameter("myPassword");

        // Debugging: Print received values
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Basic validation (optional)
        if (username != null && password != null) {
            // If valid, redirect to instoreitems.jsp
            response.sendRedirect("instoreitems.jsp");
        } else {
            // If invalid, redirect back to login.jsp
            response.sendRedirect("login.jsp");
        }
    }
}
