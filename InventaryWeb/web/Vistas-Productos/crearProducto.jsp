<%@page import="java.util.List"%>
<%@page import="DAO.CategoriaDAOImplementar"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page import="Model.Producto"%>
<%@page import="Model.Categoria"%>
<%-- 
    Document   : crearCategoria
    Created on : 21-jun-2022, 11:43:20
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="producto" scope="session" class="Model.Producto" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
         <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
         <script type="text/javascript">
             function regresar(url){
                 location.href = url;
             }
         </script>
    </head>
    <body class="justify-content-center">
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         <div class="col-auto bg-gray p-5 text-center">
            <h3 class='text-center'>Registro Productos</h3>
            <form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath() %>/productos" method="post">
                <div class="row">&nbsp;</div>
                <input type="hidden" name="id_producto" id="idPro" value="<%= producto.getId_producto()%>" >
                <div class="form-group">
                   <label for="txtNom_Produc" class="col-sm-2 control-label">Nombre Producto</label>
                   <div class="col-sm-12">
                       <input type="text" class="form-control" name="txtNom_Produc" id="txtNomProducto" value="<%= producto.getNom_producto()%>" placeholder="Nombre producto" required="true"> 
                   </div>
                </div>
                   
                <div class="form-group">
                   <label for="txtStock_pro" class="col-sm-2 control-label">Stock</label>
                   <div class="col-sm-12">
                       <input type="text" class="form-control" name="txtStock_pro" id="txtStock_pro" value="<%= producto.getStock()%>" placeholder="Stock" required="true"> 
                   </div>
                </div>
                   
                <div class="form-group">
                   <label for="txtPrecio_pro" class="col-sm-2 control-label">Precio</label>
                   <div class="col-sm-12">
                       <input type="text" class="form-control" name="txtPrecio_pro" id="txtPrecio" value="<%= producto.getPrecio()%>" placeholder="Precio" required="true"> 
                   </div>
                </div>
                   
                <div class="form-group">
                   <label for="txtUnidadM_pro" class="col-sm-2 control-label">Unidad de Medida</label>
                   <div class="col-sm-12">
                       <input type="text" class="form-control" name="txtUnidadM_pro" id="txtUnidad" value="<%= producto.getUnidadMedida()%>" placeholder="Unidad de Medida" required="true"> 
                   </div>
                </div>
                   
                <div class="form-group">
                   <label for="numEstado_pro" class="col-sm-2 control-label">Estado</label>
                   <div class="col-sm-12">
                       <input type="number" class="form-control" name="numEstado_pro" id="numEstado" value="<%= producto.getEstado()%>" placeholder="Categoria" required="true"> 
                   </div>
                </div>
                  
                   
             <div class="form-group ">
                   <label for="Idcategoria" class="col-sm-2 control-label">Categoria</label>
                   <div class="custom-select col-sm-12">
                         <select class="form-control" name="Idcategoria" id="Idcategoria" required>
                             <option>Seleccione una opcion</option>>
                             <%
                             CategoriaDAO DAO = new CategoriaDAOImplementar();
                             List<Categoria> categ = null;
                             try{
                                 categ = DAO.Listar();
                                 for(Categoria catego : categ){
                                    %>
                                   <option value="<%=catego.getId_categoria()%>"><%=catego.getId_categoria()+"-"+catego.getNom_categoria()%></option> 
<%}%>
                        </select>
                            
                   </div>
                </div>
                   
                   <div class="row">&nbsp;</div>
                    <div class="row">&nbsp;</div>
                   <div class="form-group">
                       <div class="col-sm-offset-2 col-sm-12">
                           <input type="submit" class="btn btn-success btn-sm" value="Guardar" name="btnGuardar"/> 
                           <input type="button" class="btn btn-danger btn-sm" name="btnRegresar" value="Regresar" onclick="regresar('<%= request.getContextPath() %>/productos?opcionPro=listarPro')"/> 
                       </div>
                   </div>
                   
                <div class="row">&nbsp;</div>
                <div class="row">&nbsp;</div>
                <div class="row">&nbsp;</div>
            </form>
         </div>
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
<%
                                 
                             }catch(Exception e){
                                 out.print("Se encontro el siguiente error"+e);
                             }finally{
                             }
                                    
                             %>