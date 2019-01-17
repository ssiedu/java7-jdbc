package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataEntry {

public static void main(String args[]){
    try{
    //step-1 (Driver Loading)
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded Successfully");
    //step-2 (Connection Establishment)
    String url="jdbc:mysql://localhost:3306/data7";
    String uid="root";
    String pwd="root";
    Connection con=DriverManager.getConnection(url, uid, pwd);
    System.out.println("Connected Successfully");
    //step-3 (Create an Statement object)
    // to send SQL commands to Database
    Statement stmt=con.createStatement();
    //step-4 (Send SQL statement to DB)
    String sql="insert into emp values(113,'ccc',60000)";
    int n=stmt.executeUpdate(sql);
    System.out.println(n+" row created");
    //step-5 (Close the Connection)
    con.close();
    
    
    
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }catch(SQLException e){
        e.printStackTrace();
    }
}    
}
