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
            <div class="box"> 
                <h3 style="text-align: center" >Administracion de cuentas</h3>
                <form>
                    <h3 >Gestionar usuarios</h3>
                    <button  type="submit" name="fsend"><a href="registryusers.jsp">Usuarios nuevos</a></button>
                    <button  type="submit" name="fsend"><a href="manageusers.jsp">Editar usuarios</a></button>
                </form>
            </div>
            <div class="footer">
                <a>footer</a> 
            </div>
        </div>
    </body>
</html>
