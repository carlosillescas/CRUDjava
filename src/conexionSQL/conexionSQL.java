/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Illescas
 */
public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion()    
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");
         JOptionPane.showInputDialog(null, "Conexion Exitosa");
        }catch (Exception e){
         JOptionPane.showInputDialog(null, e.getMessage());   
        }
    
    
    return conectar;
    
    
    }
    
}
