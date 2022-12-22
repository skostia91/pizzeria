<%@ page import="static sun.misc.MessageUtils.out" %>
<%@ page import="com.PizzaController" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>


<body>

    You order:
    <br>
    <br>
<c:forEach var="user" items="${value}">
    Name: ${user.pizza.name}. Cost: ${user.pizza.cost} byn. Numbers: ${user.numbers} pizzas.
    <br>
</c:forEach>

<br>
Pizza: ${key2.name} ${numbers}   Cost: ${cost}
    <br>

All cost you order: ${allCost} byn
<br>

<br><br><br><br>
Data, time: ${data}
<br>
Thanks.

<br>
<a href="/pizzeriaShilov/order">Add pizza</a>

</body>
</html>