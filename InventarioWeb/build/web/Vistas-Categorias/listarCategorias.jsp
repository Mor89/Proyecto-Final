<%-- 
    Document   : listarCategorias
    Created on : 14-jun-2022, 20:48:00
    Author     : Wilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "Modelo.Categoria" %>
<jsp:useBean id="lista" scope ="session" class = "java.util.List" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file = "../WEB-INF/Vista-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file ="../WEB-INF/Vista-Parciales/encabezado.jspf" %>
        
        <div style="width: 600px;">
            <a href="#" class ="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button">Nueva Categoria</a>
            <h3>Listado de categorias Registradas</h3>
            <table class="table table-striped">
              <!--  <tr>
                    <th>ID</th><th>NOMBRE</th><th>ESTADO</th><th>ACCION</th>
                </tr>
              
              -->
            </table>
        </div>
    </body>
</html>
