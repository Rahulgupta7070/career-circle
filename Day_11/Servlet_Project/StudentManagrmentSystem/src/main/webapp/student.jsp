<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <title>Student Details</title>
</head>

<body>

    <%
        String error = (String) request.getAttribute("error");
    %>

    <% if (error != null) { %>

        <h1>Registration Failed</h1>

        <p><%= error %></p>

    <% } else { %>

        <h1>====================================</h1>

        <h1>STUDENT DETAILS</h1>

        <h1>====================================</h1>

        <p>Student Name : ${studentName}</p>

        <p>Roll Number : ${rollNumber}</p>

        <p>Email : ${email}</p>

        <p>Age : ${age}</p>

        <p>Course : ${course}</p>

        <p>Gender : ${gender}</p>

        <h1>====================================</h1>

        <h2>${message}</h2>

        <h1>====================================</h1>

    <% } %>

</body>

</html>