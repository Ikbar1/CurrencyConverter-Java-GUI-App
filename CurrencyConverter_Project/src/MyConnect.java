


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ikbar
 */
public class MyConnect {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "currencyconverter";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
    Connection connect = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            connect = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Connect " + MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connect;
        
    }
}