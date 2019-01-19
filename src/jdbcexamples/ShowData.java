package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {
    public static void main(String[] args) throws Exception {
        String sql="select * from emp";
        Connection con=Data.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
        System.out.println(rs.getString(1));
        }
        rs.beforeFirst();
        while(rs.next()){
        System.out.println(rs.getString(2));
        }
        rs.beforeFirst();
        while(rs.next()){
        System.out.println(rs.getString(3));
        }
        //rs.absolute(3);
        //System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        
        
        con.close();
        
        
    }
}
