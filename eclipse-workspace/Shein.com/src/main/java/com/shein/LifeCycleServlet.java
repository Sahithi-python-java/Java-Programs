package com.shein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("myUsername");
        String password = request.getParameter("myPassword");
        
        RequestDispatcher rd = request.getRequestDispatcher("/instoreitems.jsp");
        rd.forward(request, response);
    }
}