<%
    int studentId = Integer.parseInt(request.getParameter("studentId"));
%>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Page</title>
</head>
<body>
    <h2>Payment for Admission</h2>
    <form action="PaymentServlet" method="post">
        <input type="hidden" name="studentId" value="<%= studentId %>">
        <label>Amount:</label>
        <input type="text" name="amount" value="5000" readonly>
        <br>
        <button type="submit">Pay</button>
    </form>
</body>
</html>