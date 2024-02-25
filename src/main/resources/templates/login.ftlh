<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Authorization</h4>
<form action="/login" method="post">
    email: <input type="email" name="username"><br><br>
    password: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="login"/>
</form>
<a href="/registration">Sing up</a>
</body>
</html>