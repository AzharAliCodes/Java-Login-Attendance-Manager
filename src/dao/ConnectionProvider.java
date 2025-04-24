package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static final String DB_NAME = "attendancesystem";
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Abumatics321";

    public static Connection getcon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL server without selecting a database
            Connection con = DriverManager.getConnection(DB_URL + "?allowPublicKeyRetrieval=true&useSSL=false", DB_USERNAME, DB_PASSWORD);

            // Check if the database exists
            if (!databaseExists(con, DB_NAME)) {
                createDatabase(con, DB_NAME);
            }

            // Reconnect to the newly created database
            con = DriverManager.getConnection(DB_URL + "/" + DB_NAME + "?useSSL=false", DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static boolean databaseExists(Connection con, String dbName) throws Exception {
        Statement stmt = con.createStatement();
        return stmt.executeQuery("SHOW DATABASES LIKE '" + dbName + "'").next();
    }

    private static void createDatabase(Connection con, String dbName) throws Exception {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE DATABASE " + dbName);  // Added space after "CREATE DATABASE"
        System.out.println("Database '" + dbName + "' Created Successfully.");
    }
}
