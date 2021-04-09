package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionPG {

    private String url = "jdbc:postgresql://localhost:5432/ARTEX";
    private String usuario = "postgres";
    private String password = "123ASDFG";
    private Connection conexion;
 

    public ConexionPG() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("CONEXION EXITOSA");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NO SE HA PODIDO ESTABLECER LA CONEXION");
        }

    }
    
      public ResultSet query(String sql) {
        try {
            Statement st;
            st = conexion.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException noquery(String nsql) {
        try {
            Statement st;
            st = conexion.createStatement();
            st.execute(nsql);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

}
