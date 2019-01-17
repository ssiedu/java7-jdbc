package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RaiseSalary {
    public static void main(String[] args) throws Exception {
        Connection con=Data.connect();
        String sql="update emp set sal=sal+1000 where eno=111";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n+" rows modieifed");
        con.close();
    }
}
