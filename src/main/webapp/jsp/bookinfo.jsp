<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>
<form:form id="bookInfo" modelAttribute="bookInfo" action="saveUserBookInfo" method="post">
    <table align="center">
        <tr> <td><form:label path="bookName">Your username </form:label></td>
            <td><form:input path="username" name="username" id="username"/></td>
        </tr>
        <tr>
            <td><form:label path="bookName">Please enter your Book Name: </form:label></td>
            <td><form:input path="bookName" name="bookName" id="bookName"/></td>
        </tr>
        <tr>
            <td><form:label path="bookDescription">Please enter the Book Description: </form:label></td>
            <td><form:input path="bookDescription" name="bookDescription" id="bookDescription"/></td>
        </tr>


        <tr>
            <td></td>
            <td><form:button id="bookInfo" name="bookInfo">Save Book Info</form:button></td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="home.jsp">Home</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>