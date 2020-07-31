<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- CSS -->
        <link href="https://fonts.googleapis.com/css2?family=Zilla+Slab:wght@500&display=swap" rel="stylesheet">
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css"> 
        <!-- BOOTSTRAP -->
        
        <title>H A N D L E |Login</title>
    </head>

    <body>
        <div class="box">
            <div>
                <div class="boxform">
                    <form action="Iniciar" method="post">
                        <div>
                            <label>Usuario</label>
                            <input type="text" class="form-control" name="fuser" placeholder="Nombre de Usuario">
                        </div>
                        <br><br>
                        <div>
                            <label>Contraseña</label>
                            <input type="password" class="form-control" name="fpassword" placeholder="Contraseña">
                        </div>
                        <button type="submit" class="btn btn-primary" name="flogin">Ingresar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>

    <script src="assets/js/jquery-1.8.2.min.js"></script>
    <script src="assets/js/supersized.3.2.7.min.js"></script>
    <script src="assets/js/supersized-init.js"></script>
    <script src="assets/js/scripts.js"></script>
</html>