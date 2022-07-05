<%-- 
    Document   : editarProducto
    Created on : 30-jun-2022, 10:53:10
    Author     : Wilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
   
    String id_pro = request.getParameter("id_Pro");
    String nombre_pro = request.getParameter("nombre");
    String stock = request.getParameter("stock");
    String precio = request.getParameter("precio");
    String unidadMedida = request.getParameter("unidad");
    String estadoProducto = request.getParameter("estadoproducto");
    String categoria = request.getParameter("categoria");
    
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body class="m-0 row justify-content-center">
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         <div class="col-auto bg-gray p-5 text-center">
        <h1 class='text-center'>Información de Producto</h1>
        <form action="actualizarProducto" method="post">
        <div class="mb-3 row">
            <label for="staticEmail" class="col-sm-2 col-form-label">ID Producto:</label>
            <div class="col-sm-10">
              <input type="number" value='<%= id_pro %>' name="id_Pro" id="id_pro" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Producto">
              <input type="hidden" value='<%= id_pro %>' name="id_Pro" id="id_pro" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Producto:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= nombre_pro %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Producto" required="true">
          </div>
        </div>
          
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Stock Producto:</label>
          <div class="col-sm-10">
              <input type="number" value='<%= stock %>' name="stock" id="stock" class="form-control" placeholder="Stock Producto" required="true">
          </div>
        </div>
          
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Precio Producto:</label>
          <div class="col-sm-10">
              <input type="number" value='<%= precio %>' name="precio" id="stock" class="form-control" placeholder="Precio Producto" required="true">
          </div>
        </div>
          
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Unidad de Medida Producto:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= unidadMedida %>' name="unidad" id="unidad" class="form-control" placeholder="Unidad Medida Producto" required="true">
          </div>
        </div>
          
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Producto:</label>
          <div class="col-sm-10">
              <input type="number" value='<%= estadoProducto %>' name="estadoproducto" id="estadoproducto" class="form-control" placeholder="Estado Producto" required="true">
          </div>
        </div>
          
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">ID Categoria Producto:</label>
          <div class="col-sm-10">
              <input type="number" value='<%= categoria %>' name="categoria" id="categoria" class="form-control" placeholder="Categoria Producto" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <button type="submit" name="send" class="btn btn-success">Actualizar Producto</button>
          </div>
        </form>
          
          <%
            String dato = request.getParameter("aviso");
            if(dato!=null){
                //out.print("Registro Actualizado Correctamente");
                //System.out.println("End");
           %>
                   <div class="alert alert-success" role="alert">
                   Registro Actualizado Correctamente!!
                 </div>
           <%   
               }
           %>

        </div>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
    