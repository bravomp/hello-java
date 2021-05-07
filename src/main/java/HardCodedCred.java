import java.sql.*;

public class HardCodedCred {
    public static void main(String [] args) {
        String DB_URL = "http://localhost:80";
        String USER = "guest";
        String PASS = "guestpw";
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, 
             USER, PASS);
            ///*username*/ "guest",
            ///*password*/ "guestpw");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 

    }

}

