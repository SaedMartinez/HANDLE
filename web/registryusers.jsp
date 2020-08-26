
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/style.css"> 
        <!-- BOOTSTRAP -->
        <title>H A N D L E |Login</title>
    </head>

    <body>
        <div class="grid-container">
            <div class="navbar">
                <iframe frameborder="0" src="navbar.jsp"></iframe>
            </div>
            <div class="inside-box">
                <div class="leftside">
                </div>
                <div class="rightside">
                    <h2 id="titleregistro">Informacion de nuevo usuario</h2>
                    <p id="textregistro">Ingresa todos los datos del usuario que desear registrar</p>
                    <form action="Registro" id="registro" method="post">
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" class="form-control" name="fuser" placeholder="Nombre">
                        </div>
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="text" class="form-control" name="fpassword" placeholder="Contraseña">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" class="form-control" name="fstatus" placeholder="Estado de usuario">
                        </div>
                        <div class="form-group">
                            <label>Cargo</label>
                            <input type="text" class="form-control" name="fposition" placeholder="Cargo">
                        </div>
                        <div class="form-group">
                            <label>Nivel</label>
                            <input type="text" class="form-control" name="flevel" placeholder="Nivel">
                        </div>
                        <button type="submit" class="btn btn-primary" name="fsend">Crear</button>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
