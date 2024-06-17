
package datos;

import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    Connection conexion;
    Statement estamento;
    ResultSet resultado;
    
    private void conexionOracle(){
     String clase= "oracle.jdbc.driver.OracleDriver";
     String url= "LOCALHOST:1521:ORCL";
     String usuario= "ADMINISTRADOR_HOSPITAL", password = "123";
     url= "jdbc:oracle:thin:@" + url;
     
     try{
         Class.forName(clase);
         conexion= DriverManager.getConnection(url, usuario, password);
     }catch(SQLException e){
         System.out.println(e.getMessage());
     }catch(ClassNotFoundException cfe){
         cfe.printStackTrace();
     }
    
        
    }
    private void desconectar(){
        try{
            conexion.close();
        }catch(SQLException sqle){
            System.out.println("Error al Desconectar" +sqle.getMessage());
        }
    }
    
    public String getDatos(){
        String dato= "";
        try{
            
            estamento= conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultado= estamento.executeQuery("SELECT *FROM MEDICO.");
            while(resultado.next()){
                dato = resultado.getString(1);
            }
            return dato;
        }catch(SQLException sqle){
            return dato;
        }
    
    }
    
}
