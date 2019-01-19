package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetUpdate {
 public static void main(String args[]) throws Exception {
      String sql="select * from emp";
      Connection con=Data.connect();
      Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs=stmt.executeQuery(sql);
      
      while(rs.next()){
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
      }
      //changing sal of 3rd row to 35000
      //moving cursor to the row to be modified
      rs.absolute(3);
      //call the updatter method to change col(s)
      rs.updateInt(3, 35000);
      //save the changes to DB
      rs.updateRow();
      System.out.println("DATA UPDATED");
      System.out.println("__________________________________________");
      rs.beforeFirst();
      while(rs.next()){
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
      }
      
      con.close();
 }   
}
