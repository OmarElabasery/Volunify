package main.java.com.example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Get the single instance of the database connection pool
        DatabaseConnectionPool connectionPool = DatabaseConnectionPool.getInstance();

        // Get a connection from the pool
        Connection connection = connectionPool.getConnection();

        // Use the connection to perform database operations
        try {
            // Create a statement
            Statement statement = connection.createStatement();
            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM fake_table");

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Fetched data: " + resultSet.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Return the connection to the pool
            connectionPool.returnConnection(connection);
        }
    }
}
