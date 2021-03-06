<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>| Inventario</title>
    </head>
    <body>
        <div class="d-flex "> 
            <div class="col-sm-1">
            </div>
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>NOMBRES</th>
                            <th>CANTIDAD</th>
                            <th>ESTADO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pr" items="${products}">
                            <tr>
                                <td>${pr.getName()}</td>
                                <td>${pr.getStock()}</td>
                                <td>${pr.getStatus()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table> 
            </div>
            <div class="col-sm-3 text-center">
                <form action="Controller?menu=Inventory" method="POST">
                    <div style="height: 180px">
                    </div>
                    <div class="">
                        <button type="submit" name="action" value="History" class=" btn btn-outline-info">Ver Historial</button>
                    </div>
                    <div style="height: 70px" >

                    </div>
                    <div class="">
                        <button type="submit" name="action" value="Modify" class=" btn btn-outline-info">Modificar</button>
                    </div>
                </form>
            </div>
        </div>
        <!-- JS-->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
