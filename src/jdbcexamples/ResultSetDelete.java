package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDelete {
public static void main(String args[]) throws Exception {
      String sql="select * from emp";
      Connection con=Data.connect();
      Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs=stmt.executeQuery(sql);
      
      while(rs.next()){
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
      }
      System.out.println("DELETING A ROW");
      
      //step-1 (move the cursor to the row to be deleted
      rs.absolute(6);
      //step-2 (delete the row)
      rs.deleteRow();
      System.out.println("ROW DELETED");
      
      
      con.close();
 }       
}
