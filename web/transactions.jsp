<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>| Transacciones</title>
        <style>
            @media print{
                .part01, .btn, .ae{
                    display: none;
                }  
            }
        </style>
    </head>
    <body>
        <div class="d-flex">
            <div class="col-sm-4 part01"> 
                <div class="card">
                    <form action="Controller?menu=Transactions" method="post">
                        <div class="card-body"> 
                            <div class="form-group">
                                <label>Datos de Usuario </label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-3">
                                    <input type="text" name="vcodeu" value="${User.getId()}" class="form-control">
                                </div>
                                <div class="col-sm-8">
                                    <input type=" text" name="vnameu" value="${User.getName()}" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Datos de Producto </label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="vcodep" value="${product.getId()}" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="action" value="Search" class=" btn btn-outline-info">Buscar</button>
                                </div>
                                <div class="col-sm-6">
                                    <input type=" text" name="vnamep" value="${product.getName()}" class="form-control" placeholder="Nombre">
                                </div>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-3 d-flex">
                                    <input type=" text" class="form-control" placeholder="DATO">
                                </div>
                                <div class="col-sm-3">
                                    <input type="number" name="vquantityp" value="1" class="form-control" >
                                </div>
                                <div class="col-sm-4">
                                    <input type=" text" name="vstockp" value="${product.getStock()}" class="form-control" placeholder="Stock">
                                </div>
                            </div>
                            <!--BOTON AGREGAR  -->
                            <div class="form-group">
                                <button type="submit" name="action" value="Add" class="btn btn-outline-info">Agregar Producto</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card"> 
                    <form action="Controller?menu=Transactions" method="post">
                        <div class="card-body"> 
                            <div class="d-flex">
                                <div class="col-sm-4 d-flex">
                                    <input type="radio" name="type" id="In" value="In"><label for="In">Entrada</label>
                                    <input type="radio" name="type" id="Out" value="Out"><label for="Out">Salida</label>
                                </div>
                                <div class="col-sm-6 ml-auto d-flex">
                                    <label>Serie</label>
                                    <br>
                                    <input type=" text" name="vsnumber" value="${nserie}" class="form-control">
                                </div>
                            </div>
                            <br>
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Nro</th>
                                        <th>Codigo</th>
                                        <th>Descripcion</th>
                                        <th>Cantidad</th>
                                        <th class="ae" >Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="list" items="${listP}">
                                        <tr>
                                            <td>${list.getItem()}</td>
                                            <td>${list.getMidproduct()}</td>
                                            <td>${list.getMnamep()}</td>
                                            <td>${list.getMquantity()}</td>
                                            <td class="d-flex">
                                                <a href="#" class="btn btn-warning">Editar</a> 
                                                <a href="#" class="btn btn-danger" style="margin-left: 10px">X</a> 
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="card-footer d-flex">
                            <div class="col-sm-6">
                                <button type=" submit" name="action" value="Cancel" class="btn btn-outline-danger">Cancelar</button>
                                <button type=" submit" name="action" value="Save"   onclick="print()"class="btn btn-outline-success">Generar</button>
                            </div>
                            <div class="col-sm-4">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>