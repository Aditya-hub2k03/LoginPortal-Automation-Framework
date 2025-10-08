<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Login Portal</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; }
        .container { width: 300px; margin: auto; }
        input { width: 100%; margin: 5px 0; padding: 8px; }
        .btn { background-color: #4CAF50; color: white; border: none; cursor: pointer; }
        .btn:hover { background-color: #45a049; }
        .error { color: red; }
    </style>
</head>
<body>
<div class="container">
    <h2>Login Page</h2>
    <form action="login" method="post">
        Email:<br>
        <input type="text" name="email" placeholder="Enter email" required/><br>
        Password:<br>
        <input type="password" name="password" placeholder="Enter password" required/><br>
        <input type="submit" value="Login" class="btn"/>
    </form>
    <c:if test="${not empty error}">
        <p class="error">${error}</p>
    </c:if>
</div>
</body>
</html>
