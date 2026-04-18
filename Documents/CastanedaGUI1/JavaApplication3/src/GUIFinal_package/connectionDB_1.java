
package GUIFinal_package;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connectionDB_1 {
    
    private static final String URL = "jdbc:mysql://localhost:3306/castanedagui";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection getConnection() {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(URL,user,password);
            System.out.println("Database Connected Successfully!");
            
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            
        }
        return conn;
        
    }

}

