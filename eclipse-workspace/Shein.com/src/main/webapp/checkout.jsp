<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Checkout</title>
</head>
<body>
    <h2>Checkout</h2>

    <%
        HttpSession sessionObj = request.getSession();
        List<String> cart = (List<String>) sessionObj.getAttribute("cart");
        List<Double> prices = (List<Double>) sessionObj.getAttribute("prices");
        double totalPrice = 0;

        if (cart == null || cart.isEmpty()) {
            out.println("<p>Your cart is empty.</p>");
        } else {
            out.println("<ul>");
            for (int i = 0; i < cart.size(); i++) {
                out.println("<li>" + cart.get(i) + " - $" + prices.get(i) + "</li>");
                totalPrice += prices.get(i);
            }
            out.println("</ul>");
            out.println("<h3>Total Price: $" + totalPrice + "</h3>");
        }
    %>

    <br>
    <form method="post" action="checkout">
        <input type="submit" value="Confirm Purchase">
    </form>
</body>
</html>
