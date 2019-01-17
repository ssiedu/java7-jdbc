package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ChangeSal {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ECode");
        int code=sc.nextInt();
        System.out.println("Enter Increment Amount");
        int amt=sc.nextInt();
        String sql="update emp set sal=sal+? where eno=?";
        
        Connection con=Data.connect();
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1, amt);
        ps.setInt(2, code);
        
        int  n=ps.executeUpdate();
        
        con.close();
        
        System.out.println(n+" Records Modified");
    }
}
