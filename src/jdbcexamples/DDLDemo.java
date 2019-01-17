package jdbcexamples;

import java.sql.Connection;
import java.sql.Statement;

public class DDLDemo {
    public static void main(String[] args) throws Exception {
    
        String sql="create table dummy (firstcol char, secondcol char)";
        Connection con=Data.connect();
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n);
        System.out.println("Table Created");
        con.close();
    }
}
