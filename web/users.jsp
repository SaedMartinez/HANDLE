<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>| Administración</title>
    </head>
    <body>
        <div class="d-flex"> 
            <div class="card col-sm-4">
                <div class="card-body" >
                    <form action="Controller?menu=Users" method="POST">
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="text" value="${CSuser.getPass()}" name="vpasssu" class="form-control">  
                        </div> 
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" value="${CSuser.getName()}" name="vnamesu" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Telefono</label>
                            <input type="text" value="${CSuser.getPnum()}" name="vpnumsu" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${CSuser.getStatus()}" name="vstatussu" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Usuario</label>
                            <input type="text" value="${CSuser.getUser()}" name="vusersu" class="form-control">
                        </div>
                        <button type="submit" name="action" value="Add" class=" btn btn-outline-info">Agregar</button>
                        <button type="submit" name="action" value="Update" class=" btn btn-outline-success">Actualizar</button>
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>CONSTRASEÑA</th>
                            <th>NOMBRES</th>
                            <th>TELEFONO</th>
                            <th>ESTADO</th>
                            <th>USER</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="us" items="${users}">
                            <tr>
                                <td>${us.getPass()}</td>
                                <td>${us.getName()}</td>
                                <td>${us.getPnum()}</td>
                                <td>${us.getStatus()}</td>
                                <td>${us.getUser()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controller?menu=Users&action=Edit&id=${us.getId()}">Editar</a>
                                    <a class="btn btn-danger" href="Controller?menu=Users&action=Desactivate&id=${us.getId()}">X</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table> 
            </div>
        </div>       
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
