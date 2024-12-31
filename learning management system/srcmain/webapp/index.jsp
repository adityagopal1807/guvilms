<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>LMS Home</title>
</head>
<body>
    <h1>Welcome to the Learning Management System</h1>
    <form action="lms" method="post">
        <h2>Add a Student</h2>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <button type="submit">Add Student</button>
    </form>
    <form action="lms" method="get">
        <button type="submit">View Students</button>
    </form>
</body>
</html>
