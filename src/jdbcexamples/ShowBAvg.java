package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowBAvg {
public static void main(String[] args) throws Exception {
        Connection con=Data.connect();
        String qr="select eno,ename,sal from emp where sal<(select avg(sal) from emp)";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(qr);
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            System.out.println(s1+"\t"+s2+"\t"+s3);
        }
        con.close();
    }    
}
