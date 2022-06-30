package Modelo;


public class Categoria {
    private int id_categoria;
    private String nomb_categoria;
    private int estado_categoria;

    public Categoria() {
        this.id_categoria = 0;
        this.nomb_categoria = "";
        this.estado_categoria = 1;
    }

    public Categoria(int id_categoria, String nomb_categoria, int estado_categoria) {
        this.id_categoria = id_categoria;
        this.nomb_categoria = nomb_categoria;
        this.estado_categoria = estado_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNomb_categoria() {
        return nomb_categoria;
    }

    public void setNomb_categoria(String nomb_categoria) {
        this.nomb_categoria = nomb_categoria;
    }

    public int getEstado_categoria() {
        return estado_categoria;
    }

    public void setEstado_categoria(int estado_categoria) {
        this.estado_categoria = estado_categoria;
    }
    
    
}
