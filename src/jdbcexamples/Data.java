package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;

public class Data {

    public static Connection connect() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data7", "root", "root");
        return con;
    }
}
