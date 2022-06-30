package DAO;

import Factory.ConexionBd;
import Factory.FactoryConexionDB;
import Modelo.Categoria;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOImplementar implements CategoriaDAO {

    ConexionBd conn;//Crear el objeto tipo conexion.

    public CategoriaDAOImplementar() {
        // Definir la base de datos que se conectara por defecto. 
    }

    @Override
    public List<Categoria> Listar() {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();//construir la consulta
        miSQL.append("SELECT * FROM tb_categoria");//agregar la consulta
        List<Categoria> lista = new ArrayList<Categoria>();
        try {
            //se crea el objeto ResultSet implementando el metodo(consultaSQL) creado para la consulta
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while (resultadoSQL.next()) {
                Categoria categoria = new Categoria();//Declaracion del objeto categoria
                //asignar cada campo consultado al atributo de la clase 
                categoria.setId_categoria(resultadoSQL.getInt("id_categoria"));
                categoria.setNomb_categoria(resultadoSQL.getString("nom_categoria"));
                categoria.setEstado_categoria(resultadoSQL.getInt("estado_categoria"));
                lista.add(categoria);//Agregar al array cada registro encontrado
            }
        } catch (Exception ex) {

        } finally {
            this.conn.cerrarConexion();//Para cerrar la conexion
        }
        return lista;
    }

    @Override
    public List<Categoria> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria editarCat(int id_cat_edit) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);//Hacer la conexion
        Categoria categoria = new Categoria();//Creando una instancia de categoria para devolver datos
        StringBuilder miSQL = new StringBuilder();//Creando una instancia para para la consulta
        //creando la instancia para la Consulta SQL
        miSQL.append("SELECT * FROM tb_categoria WHERE id_categoria = ").append(id_cat_edit);
        try {//Realizar la consulta
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while (resultadoSQL.next()) {
                categoria.setId_categoria(resultadoSQL.getInt("id_categoria"));
                categoria.setNomb_categoria(resultadoSQL.getString("nom_categoria"));
                categoria.setEstado_categoria(resultadoSQL.getInt("estado_categoria"));
            }
        } catch (Exception ex) {
        } finally {
            this.conn.cerrarConexion();
        }
        return categoria;
    }

    @Override
    public boolean guardarCat(Categoria categoria) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        boolean guarda = false;//Bandera de resultado
        try {
            if (categoria.getId_categoria() == 0) {//Para cuando es una nueva categoria
                StringBuilder miSQL = new StringBuilder();
                //Agregar consulta SQL; el id_categoria es autoincrementable
                miSQL.append("INSERT INTO tb_categoria(nom_categoria, estado_categoria) VALUES ('");
                miSQL.append(categoria.getNomb_categoria() + "', ").append(categoria.getEstado_categoria());
                miSQL.append(");");

                //Invocar metodo para ejecutar la consulta
                this.conn.ejecutarSQL(miSQL.toString());
            } else if (categoria.getId_categoria() > 0) {//Actualizar, id_categoria mayores a 0
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("UPDATE tb_categoria SET id_categoria = ").append(categoria.getId_categoria());
                miSQL.append(", nom_categoria = '").append(categoria.getNomb_categoria());
                miSQL.append("', estado_categoria = ").append(categoria.getEstado_categoria());
                miSQL.append(" WHERE id_categoria = ").append(categoria.getId_categoria()).append(";");
                //Invocar metodo para ejecutar la consulta
                this.conn.ejecutarSQL(miSQL.toString());
            }
        } catch (Exception e) {
        } finally {
            this.conn.cerrarConexion();//Cerrar conexion
        }
        return guarda;
    }

    @Override
    public boolean borrarCat(int id_cat_borrar) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        boolean borrar = false;
        try {
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("DELETE FROM tb_categoria WHERE id_categoria = ").append(id_cat_borrar);
            this.conn.ejecutarSQL(miSQL.toString());
            borrar = true;
        } catch (Exception e) {
        } finally {
            this.conn.cerrarConexion();
        }
        return borrar;
    }
}