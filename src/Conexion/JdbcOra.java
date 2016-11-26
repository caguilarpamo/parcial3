package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;



public class JdbcOra {
    public JdbcOra(){
    	
    	
    }
    
    //Usuario de la base de datos
   private final String USUARIO = "parcial3";
   //Contrase�a del usuario de la base de datos
   private final String PASS = "parcial3";
   //SID de la base de datos, este lo registramos en la instalacion
   private final String SID = "xe";
   //Host donde se encuentra la base de datos, para nuesto caso como es local
   //se indica que esta en localhost
   private final String HOST = "localhost";
   //El puerto 1521 es el estandar para este tipo de instalaciones a menos que
   //se indicque lo contrario
   private final int PUERTO = 1525;
   //Objeto donde se almacenara nuestra conexion
   private Connection connection;

   public Connection getConnection() {
       return connection;
   }    

   /*
   * Instanciamos un objeto de tipo OracleDriver para regitrarlo y posterior uso
   * este objeto lo provee el driver que agregamos al principio
   */
  public void registrarDriver() throws SQLException {
      OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
      DriverManager.registerDriver(oracleDriver);
  }   
  
   /* public static Connection getConnection() throws Exception{
        // Establece el nombre del driver a utilizar
       String dbDriver = "com.mysql.jdbc.Driver";       
       // Establece la conexion a utilizar contra la base de datos
       String dbConnString = "jdbc:mysql://localhost/6to_ET3";       
       // Establece el usuario de la base de datos
       String dbUser = "root";       
       // Establece la contrase�a de la base de datos
       String dbPassword = "";       
       // Establece el driver de conexi�n
       Class.forName(dbDriver).newInstance();       
       // Retorna la conexi�n
       return DriverManager.getConnection(dbConnString, dbUser, dbPassword);    	
    	
    }*/
    
    public void conectar() throws SQLException {
        //System.out.println(connection);
        if (connection == null || connection.isClosed() == true) {
            String cadenaConexion = "jdbc:oracle:thin:@" + HOST + ":" + PUERTO + ":" + SID;
            registrarDriver();
            connection = DriverManager.getConnection(cadenaConexion, USUARIO, PASS);
        }
    }   
    
    /*
    * Con este metodo cerramos la conexion una vez hayamos terminado de usar la
    * base de datos
    */
   public void cerrar() throws SQLException {
       if (connection != null && connection.isClosed() == false) {
           connection.close();
       }
   }    
}
