package com.shein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class CartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        // Retrieve or create the cart and prices list from the session
        List<String> cart = (List<String>) session.getAttribute("cart");
        List<Double> prices = (List<Double>) session.getAttribute("prices");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }
        if (prices == null) {
            prices = new ArrayList<>();
            session.setAttribute("prices", prices);
        }

        // Get item and price from the form submission
        String item = request.getParameter("item");
        String priceStr = request.getParameter("price");

        if (item != null && priceStr != null) {
            try {
                double price = Double.parseDouble(priceStr);
                cart.add(item);
                prices.add(price);
            } catch (NumberFormatException e) {
                e.printStackTrace(); // Log error
            }
        }

        // Update the session
        session.setAttribute("cart", cart);
        session.setAttribute("prices", prices);

        // Redirect to the items page after adding to cart
        response.sendRedirect("instoreitems.jsp");
    }
}
