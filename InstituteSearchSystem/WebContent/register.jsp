<%
    String instituteId = request.getParameter("instituteId");
    String instituteName = request.getParameter("instituteName");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Register for Institute</title>
</head>
<body>
    <h2>Register for <%= instituteName %></h2>
    <form action="RegisterServlet" method="post">
        <input type="hidden" name="instituteId" value="<%= instituteId %>">
        <label>Name:</label>
        <input type="text" name="name" required>
        <br>
        <label>Email:</label>
        <input type="email" name="email" required>
        <br>
        <label>Password:</label>
        <input type="password" name="password" required>
        <br>
        <button type="submit">Register</button>
    </form>
    <a href="index.jsp">Go Back</a>
</body>
</html>