package Aplicacion.ConeccionSql;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericConnections {
    public Connection Coneccions() {
        // String dbName = "db1";
        Connection conect = null ;
         try {
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url = "jdbc:sqlserver://localhost:1433;databaseName=Arquitectos";
             conect= DriverManager.getConnection(url, "Martin", "******");
         } catch (Exception e) {
             e.printStackTrace();
         }
         return conect;
     }
    public boolean CloseConnection(Connection connection) {
        boolean res = false;
        try {
            connection.close();
            res = true;
        } catch (Exception e) {
            res = false;
        }
        return res;
    }
}
