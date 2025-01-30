<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admission Confirmed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            color: #fff;
            text-align: center;
            padding: 50px;
        }
        .container {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            max-width: 500px;
            margin: auto;
            color: #333;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
        }
        h1 {
            color: #4CAF50;
        }
        p {
            font-size: 18px;
            margin: 15px 0;
        }
        .button {
            display: inline-block;
            margin: 15px 0;
            padding: 10px 20px;
            color: #fff;
            background: #4CAF50;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
        }
        .button:hover {
            background: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Admission Confirmed!</h1>
        <p>Thank you, <strong><%= request.getParameter("studentName") %></strong>, for completing your admission process!</p>
        <p>You have successfully registered for the <strong><%= request.getParameter("course") %></strong> course at <strong>Sumaya Academy</strong>.</p>
        <p>We look forward to helping you achieve your academic goals!</p>
        <a href="courses.jsp" class="button">View Available Courses</a>
    </div>
</body>
</html>