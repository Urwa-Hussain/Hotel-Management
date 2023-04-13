
package Database;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.*;
public class Connections {
    Connection con;
    PreparedStatement pst;
    public Connections(){
        Connect();
    }
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "root", "urwa123");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
