<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Available Courses</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            text-align: center;
            padding: 50px;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            display: inline-block;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #4CAF50;
        }
        .course {
            margin: 20px;
            font-size: 18px;
        }
        .button {
            display: inline-block;
            margin: 10px;
            background: #4CAF50;
            color: white;
            padding: 10px 20px;
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
        <h1>Choose Your Course</h1>
        <div class="course">
            <p>BCA - Bachelor of Computer Applications</p>
            <a href="schedule.jsp?course=BCA" class="button">View BCA Schedule</a>
        </div>
        <div class="course">
            <p>MCA - Master of Computer Applications</p>
            <a href="schedule.jsp?course=MCA" class="button">View MCA Schedule</a>
        </div>
    </div>
</body>
</html>
