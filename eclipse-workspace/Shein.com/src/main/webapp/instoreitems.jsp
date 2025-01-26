<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>In-Store Items</title>
</head>
<body>
    <h2>Available Items</h2>

    <form method="post" action="cart">
        <p>Eggs - $2.00 
            <input type="hidden" name="item" value="Eggs">
            <input type="hidden" name="price" value="2.00">
            <input type="submit" value="Add to Cart">
        </p>
    </form>

    <form method="post" action="cart">
        <p>Milk - $3.50 
            <input type="hidden" name="item" value="Milk">
            <input type="hidden" name="price" value="3.50">
            <input type="submit" value="Add to Cart">
        </p>
    </form>

    <form method="post" action="cart">
        <p>Bread - $1.80 
            <input type="hidden" name="item" value="Bread">
            <input type="hidden" name="price" value="1.80">
            <input type="submit" value="Add to Cart">
        </p>
    </form>

    <br>
    <a href="checkout.jsp"><button>Proceed to Checkout</button></a>
</body>
</html>
