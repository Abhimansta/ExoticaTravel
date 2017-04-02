<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <c:if test="${not empty errorMessage}">
    <p>
    <font color="red">Please correct the following errors:
    <ul>
    <c:forEach var="message" items="${errorMessage}">
    <li>${message}</li>
    </c:forEach>
    </ul>
    </font>
    </p>
    </c:if>

        <form action="RegistrationServlet">
            <table>
                <tr><th colspan="2">Registration Details</th>
                <tr><td>Name<td><input type='text' name='uname' value="${unameAtt}"/>
                <tr><td>Address<td><input type='text' name='address' value="${addressAtt}"/>
                <tr><td>Contact Number<td><input type='text' name='contactno' value="${contactnoAtt}"/>
                <tr><td>Login ID<td><input type='text' name='loginid' value="${loginidAtt}"/>
                <tr><td>Password<td><input type='password' name='password' value="${passwordAtt}"/>
                <tr><td>Re-enter Password<td><input type='password' name='repassword' value="${reEnterPassword}"/>
                <tr><td colspan="3"><input type='submit' name='submit' value='Submit'/>
            </table>
        </form>

    </body>
</html>
