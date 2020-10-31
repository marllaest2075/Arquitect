package Aplicacion;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import Aplicacion.ConeccionSql.GenericConnections;

public class GenericConnectionsTest {
    @Test
    public void ConnectionsTest() {
        GenericConnections gc = new GenericConnections();
        Connection con = gc.Coneccions();
        assertTrue(con != null);
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void CloseConnectionTest() {
        GenericConnections gc = new GenericConnections();
        Connection con = gc.Coneccions();
        assertTrue(con != null);
       boolean res = gc.CloseConnection(con);
       assertTrue(res);
    }

}
