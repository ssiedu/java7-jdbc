package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultInsert {
 public static void main(String args[]) throws Exception {
      String sql="select * from emp";
      Connection con=Data.connect();
      Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs=stmt.executeQuery(sql);
      
      while(rs.next()){
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
      }
      System.out.println("Inserting A New Row");
      rs.moveToInsertRow();
      //updating values for new row
      rs.updateInt(1, 110);
      rs.updateString(2,"GGG");
      //rs.updateInt(3, 60000);
      //save the new row to DB
      rs.insertRow();
      System.out.println("RECORD ADDED");
      con.close();
 }   
}
