
package controller;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Categorias extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         this.listaCategorias(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

     protected void listaCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        //Crear instancia a CategoriaDAO
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        //Crear instancia de sesión; se le da true para crear la cecion
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", categoria.Listar());//lista es el nombre de la sesion
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarCategorias.jsp");
        dispatcher.forward(request, response);
    }
    
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>



}
