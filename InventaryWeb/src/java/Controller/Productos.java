/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 
 */
package Controller;




import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Wilson
 */
public class Productos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Productos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this.listarProductos(request, response);
        String estadop = request.getParameter("opcion");
         String id_pro = request.getParameter("idPro");
         String nombre_pro = request.getParameter("nombrePro");
         String stock_pro = request.getParameter("stockPro");
         String precio_pro = request.getParameter("precioPro");
         String unidadM_pro = request.getParameter("unidadPro");
         String estado_pro = request.getParameter("estadoPro");
         String categoria_pro = request.getParameter("categoriaPro");
         
         if(estadop.equals("listar")){
             this.listarProductos(request, response);
         } else if(estadop.equals("crear")){
             String pagina = "/Vistas-Productos/crearProducto.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
             dispatcher.forward(request, response);
         }else if(estadop.equals("editar")){
             System.out.println("Editando categorias....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/editarProducto.jsp?idPro="+id_pro+"&&nombre="+nombre_pro+
                     "&&stockPro="+stock_pro+"&&precioPro="+precio_pro+"&&unidadPro="+unidadM_pro+"&&estadoPro="+estado_pro+"&&categoriaPro ="+categoria_pro);
             dispatcher.forward(request, response);
            
         }/*else if(estadop.equals("eliminar")){
             System.out.println("Baja de categorias...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/bajaCategorias.jsp?id="+id_cat+"&&nombre="+nombre_cat);
             dispatcher.forward(request, response);
         }else{
                 
        }*/
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         Producto producto = new Producto();
       
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNom_produc"));
        producto.setStock(Float.parseFloat(request.getParameter("txtStock_pro")));
        producto.setPrecio(Float.parseFloat(request.getParameter("txtPrecio_pro")));
        producto.setUnidadMedida(request.getParameter("txtUnidadM_pro"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtEstado_pro")));
        producto.setCatogoria_id(Integer.parseInt(request.getParameter("Idcategoria_pro")));
       
       
        //System.out.println("1" + (request.getParameter("txtId_producto")));
        //System.out.println("Naranja" + (request.getParameter("txtNom_pro")));
       
        ProductoDAO guardaProducto = new ProductoDAOImplementar();
        guardaProducto.guardarPro(producto);
        this.listarProductos(request, response);
    }
     protected void listarProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ProductoDAO producto = new ProductoDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", producto.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
         dispatcher.forward(request, response);
         
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
