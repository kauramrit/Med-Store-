
package ch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Javaconnect {
     //Connection connection;
     static Connection connection = null;
   
    ResultSet resultSet = null;

    public static Connection ConnecrDb(){
        try{
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         // String msAccDB = ;
        System.out.println("done");
         String dbURL = "jdbc:ucanaccess://C:\\Users\\AKUL\\Desktop\\ChemistStock.accdb";
        connection = DriverManager.getConnection(dbURL); 
        System.out.println("MS Access database connected");
            return connection;
        }
        catch(Exception e){
           System.out.println(e);
            return null;
        }
    }
}