
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Modelo.Categoria;
import java.util.List;

/**
 *
 * @author Wilson
 */
public class Prueba {
    public static void main(String[] args) {
        Prueba evaluar = new Prueba();
        evaluar.eliminarCategoria();
        evaluar.guardaCategoria();
        evaluar.listarCategorias();
        //evaluar.editarCategoria();
    }
    
    /*public void editarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        //List<Categoria> listar = categoria.Listar();
        Categoria cat_edit = categoria.editarCat(1);
        System.out.println("CATEGORIA MODIFICAR");
        //for(Categoria categoriaListar : listar){
            System.out.println(" ID : " + cat_edit.getId_categoria() +
                               " Nombre : " + cat_edit.getNomb_categoria() +
                               " Estado : " + cat_edit.getEstado_categoria());
        
    }*/
    
    public void guardaCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria guarda_cat = new Categoria();
        guarda_cat.setNomb_categoria("Bebidas Naturales");
        guarda_cat.setId_categoria(5);
        guarda_cat.setEstado_categoria(1);
        categoria.guardarCat(guarda_cat);
    }
    
    public void listarCategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for(Categoria categoriaListar : listar){
            System.out.println(" ID :" + categoriaListar.getId_categoria() +
                               " NOMBRE :" + categoriaListar.getNomb_categoria() +
                               " ESTADO :" + categoriaListar.getEstado_categoria());
        }
    }
    
    public void eliminarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(2);
    }
}
