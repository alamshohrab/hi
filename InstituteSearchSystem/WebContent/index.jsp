<!DOCTYPE html>
<html>
<head>
    <title>Search Institute</title>
</head>
<body>
    <h2>Search for an Institute</h2>
    <form action="SearchServlet" method="post">
        <label>Select Location:</label>
        <select name="location" required>
            <option value="Delhi">Delhi</option>
            <option value="Mumbai">Mumbai</option>
            <option value="Kolkata">Kolkata</option>
        </select>
        <button type="submit">Search</button>
    </form>
</body>
</html>