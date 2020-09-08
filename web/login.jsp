<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- BOOTSTRAP -->
    <title>H A N D L E |Login</title>
</head>

<body>
    <div class="grid-container">
        <div class="chart">
            <form action="Validar" method="post">
                <div>
                    <input type="text" name="vuser" placeholder="Nombre de Usuario">
                    <p> For your safety dont share your user, ITS ONLY YOURS! </p>
                </div>
                <br><br>
                <div>
                    <input type="password" name="vpassword" placeholder="Contraseña">
                </div>
                <button type="submit" name="accion" value="Ingresar">Ingresar</button>
            </form>
        </div>
    </div>
</body>

</html>