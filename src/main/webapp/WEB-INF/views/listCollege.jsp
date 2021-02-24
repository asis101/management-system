<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <%@ include file="header.jsp" %>
</head>
<body>
<div>
    <a href="add_college" class="btn btn-primary">Add College</a>
</div>
<c:if test="${!empty colleges}">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>College name</th>
            <th>City</th>
            <th>State</th>
            <th>Country</th>
            <th>Contact No</th>
            <th>Course Name</th>
            <th>Course Period</th>
            <th>Course Cost</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${colleges}" var="c">
            <tr>
                <td>${c.id}</td>
                <td>${c.collegeName}</td>
                <td>${c.address.city}</td>
                <td>${c.address.state}</td>
                <td>${c.address.country}</td>
                <td>${c.contactNo}</td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <a href="edit_college?id=${c.id}" class="btn btn-primary btn-sm">Edit</a>
                    <a href="delete_college?id=${c.id}" class="btn btn-danger btn-sm">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>

</body>
</html>