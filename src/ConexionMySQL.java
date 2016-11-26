
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConexionMySQL {
    
    public String db="sistemasventas";
    
    public String url="jdbc:mysql://localhost/"+db;
    
    public String user="root";
    
    public String pass="";
    
    
    public ConexionMySQL(){
        
    }
    
    
    public Connection Conectar(){
        
        Connection link = null;
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.pass);
        }
        catch(ClassNotFoundException|SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return link;
    }
    
}
