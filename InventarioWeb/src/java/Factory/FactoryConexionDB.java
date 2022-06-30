
package Factory;


public class FactoryConexionDB {
    
    public static final int MySQL = 1;
    public static String[] configMySQL = {"bd_inventario2","root",""};
    
    public static ConexionBd open(int tipoDB){
        switch(tipoDB){
            case FactoryConexionDB.MySQL:
                return new MySQLConexionFactory(configMySQL);
            default:
                return null;
        }
    }
}
