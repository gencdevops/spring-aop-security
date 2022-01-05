<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring Boot</title>
</head>
<body>
<h1>Spring Security</h1>
<h2>Login Page</h2>
Ileti : ${message}

<form name="login" action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token}" />
    Kullanici : <input type="text" name="username" /> <br/>
    Parola : <input type="password" name="password"/> <br/>
    <input type="submit" value="Giris"/>

</form>
</body>
</html>