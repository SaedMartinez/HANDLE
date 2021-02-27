<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>| Historial-Transacciones</title>
        <style>
            tr[data-href]{
                cursor: pointer; 
            }
        </style>
    </head>
    <body>
        <div class="d-flex "> 
            <div class="col-sm-5">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th># TRANSACCIÓN</th>
                            <th>FECHA</th>
                            <th>USUARIO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="ht" items="${history}">
                            <tr data-href="Controller?menu=Ihistory&action=Details&vidt=${ht.getId()}">
                                <td>${ht.getSnumber()}</td>
                                <td>${ht.getMdate()}</td>
                                <td>${ht.getMnameuser()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table> 
            </div>
            <div class="card col-sm-7">
                <div class="card-body" >
                    <div class="d-flex">
                        <label class="form-control text-center">${dT.getSnumber()}</label>
                        <label class="form-control text-center">${dT.getMdate()}</label>
                        <label class="form-control text-center">${dT.getMnameuser()}</label>
                    </div>
                    <table class="table">
                        <tr>
                            <th>CANTIDAD</th>
                            <th>CODIGO</th>
                            <th>PRODUCTO</th>
                        </tr>
                        <tbody>
                            <c:forEach var="htd" items="${details}">
                                <tr>
                                    <td>${htd.getMquantity()}</td>
                                    <td>${htd.getMidproduct()}</td>
                                    <td>${htd.getMnamep()}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table> 
                </div>
            </div>
        </div>

        <!-- JAVASCRITP -->
        <script>
            document.addEventListener("DOMContentLoaded", () => {
                const rows = document.querySelectorAll("tr[data-href]");

                rows.forEach(row => {
                    row.addEventListener("click", () => {
                        window.location.href = row.dataset.href;
                    });
                });
            });
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
