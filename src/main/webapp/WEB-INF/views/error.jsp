<html>
<head>
    <title>Login Failed</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; }
        .container { width: 400px; margin: auto; text-align: center; }
        .error { color: red; font-size: 20px; }
        .btn { background-color: #4CAF50; color: white; padding: 8px; text-decoration: none; }
        .btn:hover { background-color: #45a049; }
    </style>
</head>
<body>
<div class="container">
    <h2 class="error">Login Failed!</h2>
    <p>${error}</p>
    <a href="/" class="btn">Try Again</a>
</div>
</body>
</html>
