
package BD;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySql {
    public String db="restorant", url="jdbc:mysql://127.0.0.1:3306/"+db, user="root",pass="";
    
    public ConexionMySql(){}
    
    public Connection Conectar(){
        Connection link=null;
        try{
            //Cargamos Driver
        Class.forName("org.gjt.mm.mysql.Driver");
            //Creamos un enlace hacia la BDD
        link = DriverManager.getConnection(this.url,this.user,this.pass);
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
            return link;
    }
}
