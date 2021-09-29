
package act1;

import java.sql.Connection;
import java.sql.DriverManager;



public class Act1 {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    
    public static void main(String[] args) {
        
    }
    
    public static Connection connection() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");
        }
        return connection;
    }
    
}
