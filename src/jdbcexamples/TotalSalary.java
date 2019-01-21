/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//finding total salary project wise
public class TotalSalary {
    public static void main(String[] args) throws Exception {
        Connection con=Data.connect();
        String qr="select pcode,SUM(sal)from emp group by pcode";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(qr);
        while(rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            System.out.println(s1+"\t"+s2);
        }
        con.close();
    }
}
