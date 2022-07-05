package Model;


public class Producto {
    private int id_producto;
    private String nom_producto;
    private int catogoria_id;
    private float stock;
    private float precio;
    private String unidadMedida;
    private int estado;
    private Categoria categoria;
    private String catego;

    public Producto() {
        this.id_producto = 0;
        this.nom_producto = "";
        this.stock = 0.0f;
        this.precio = 0.0f;
        this.unidadMedida = "";
        this.estado = 0;
        this.categoria = new Categoria();
        this.catogoria_id = 0;
        this.catego ="";
    }

    public Producto(int id_producto, String nom_producto, int catogoria_id, float stock, float precio, 
            String unidadMedida, int estado, Categoria categoria, String catego) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.catogoria_id = catogoria_id;
        this.stock = stock;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
        this.categoria = categoria;
        this.catego = catego;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getCatogoria_id() {
        return catogoria_id;
    }

    public void setCatogoria_id(int catogoria_id) {
        this.catogoria_id = catogoria_id;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCatego() {
        return catego;
    }

    public void setCatego(String catego) {
        this.catego = catego;
    }
    
    
    
    
    
}
