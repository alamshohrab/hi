<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class Schedule</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #e9f5f5;
            padding: 50px;
            text-align: center;
        }
        .container {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            max-width: 600px;
            margin: auto;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        h1 {
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table th, table td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }
        table th {
            background: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Class Schedule for <%= request.getParameter("course") %></h1>
        <table>
            <thead>
                <tr>
                    <th>Day</th>
                    <th>Time</th>
                    <th>Subject</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    String course = request.getParameter("course");
                    if ("BCA".equals(course)) { 
                %>
                    <tr>
                        <td>Monday</td>
                        <td>10:00 AM - 12:00 PM</td>
                        <td>Computer Fundamentals</td>
                    </tr>
                    <tr>
                        <td>Wednesday</td>
                        <td>2:00 PM - 4:00 PM</td>
                        <td>Mathematics</td>
                    </tr>
                <% 
                    } else if ("MCA".equals(course)) { 
                %>
                    <tr>
                        <td>Tuesday</td>
                        <td>11:00 AM - 1:00 PM</td>
                        <td>Advanced Programming</td>
                    </tr>
                    <tr>
                        <td>Thursday</td>
                        <td>3:00 PM - 5:00 PM</td>
                        <td>Database Management</td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>