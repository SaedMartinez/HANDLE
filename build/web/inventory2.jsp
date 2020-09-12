<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/style.css"> 
        <!-- BOOTSTRAP -->
        <title>H A N D L E | Inventario</title>
    </head>

    <body>
        <div class="grid-container"> 
            <div class="box1">
                <table>
                    <thead>
                        <tr> 
                            <th>CODIGO PRODUCTO</th>
                            <th>NOMBRE</th>
                            <th>DESCRIPCION</th>
                            <th>CANTIDAD</th>
                            <th>FOTO</th>
                            <th>CATEGORIA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${vproducts}">
                            <tr> 
                                <td>${p.getMid_product()}</td>
                                <td>${p.getMname()}</td>
                                <td>${p.getMdescription()}</td>
                                <td>${p.getMq_stock()}</td>
                                <td></td>
                                <td>${p.getMid_category()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="box2">
                <button><a href="">Modificar</a></button>
            </div>
        </div>
    </body>
</html>