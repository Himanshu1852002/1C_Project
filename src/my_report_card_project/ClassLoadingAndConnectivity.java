package my_report_card_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassLoadingAndConnectivity {

    public static Connection con;

    public static void loadAndConnect() throws ClassNotFoundException, SQLException {
        
        // load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // make a connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
                "Himanshu@6266");

        if (con.isClosed()) {
            System.out.println("connection Haven't Created");

        }
    }
  
}
