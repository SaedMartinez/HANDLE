<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Last-Modified" content="0">
        <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
        <meta http-equiv="Pragma" content="no-cache">
        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/style.css"> 
        <!-- BOOTSTRAP -->
        <title>H A N D L E |Login</title>
    </head>

    <body>
        <div class="navbar">
            <div class="navbar-grid">
                <div class="h-logo">H A N D L E</div>
                <div class="h-home"><a href="Controlador?menu=Principal">Home</a></div>
                <div class="h-menu">
                    <form action="Validar" method="post">
                        <button name="accion" value="Salir">+</button>
                    </form>
                </div>
            </div>
        </div>
        <div style="height: 450px">
            <iframe name="framebox" style="height: 100%;width: 100%;border: none;" src="principal.jsp"></iframe>
        </div>
    </body>
</html>
