<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="font" uri="http://www.springframework.org/tags/form" %>
<body>


<form:form action="order2" modelAttribute="key1">

    You order
    <br>
    <form:select path="name">
        <form:options items="${key1.pizzaList}"/> <!--обозначает элементы коллекций -->
    </form:select>

    Numbers<input type="number" name="numbers"/>


    <input type="submit" value="Ok">
</form:form>


</body>