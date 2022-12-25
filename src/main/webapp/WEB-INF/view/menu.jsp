<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>


<h2>

    <c:forEach var="user" items="${value}">
        Name: ${user.name}. Cost: ${user.cost} byn.
        <br>
    </c:forEach>


    <br>
    <br>
    <br>
    <a href="/pizzeriaShilov/order">Please, make your order</a>



</h2>
</body>