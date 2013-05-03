<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Sample Web Dev with Spring and hibernate</title>
</head>
<body>
 
<h2>User Manager</h2>
 
<form:form method="post" action="add.html" commandName="user">
 
    <table>
    <tr>
        <td><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="firstName" /></td> 
    </tr>
    <tr>
        <td><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td><form:label path="userId"><spring:message code="label.userid"/></form:label></td>
        <td><form:input path="userId" /></td>
    </tr>
    <tr>
        <td><form:label path="address"><spring:message code="label.address"/></form:label></td>
        <td><form:input path="address" /></td>
    </tr>
    <tr>
        <td><form:label path="city"><spring:message code="label.city"/></form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.adduser"/>"/>
        </td>
    </tr>
</table>  
</form:form>
 
     
<h3>Users</h3>
<c:if  test="${!empty userList}">
<table class="data" border="1">
<tr>
    <th>Name</th>
    <th>User ID</th>
    <th>Address</th>
    <th>City</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${userList}" var="user">
    <tr>
        <td>${user.lastName}, ${user.firstName} </td>
        <td>${user.userId}</td>
        <td>${user.address}</td>
        <td>${user.city}</td>
        <td><a href="delete/${user.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>