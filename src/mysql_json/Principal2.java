package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world_x";//Protocolo,Nombre Servidor,Puerto,Nombre Base Datos
        String pais = "Peru";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "12345678");
            String query = "SELECT doc->'$.government.GovernmentForm' FROM countryinfo WHERE doc->'$.Name' = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, pais);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String cadena = rs.getString(1);
                String limpiar = cadena.substring(1, cadena.length() - 1);
                System.out.println(limpiar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
