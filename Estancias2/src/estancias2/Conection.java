
package estancias2;
import java.sql.Connection;
import java.sql.DriverManager;

/*** @author miguelangel */
public class Conection {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //conector para enlazar a la base de datos mysql
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/estancias2","root",""); //credenciales del servidor local
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
