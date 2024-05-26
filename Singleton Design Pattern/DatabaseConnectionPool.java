package main.java.com.example;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {
    private static volatile DatabaseConnectionPool instance;
    private List<Connection> connectionPool;
    private int poolSize = 10;

    // Private constructor to prevent instantiation
    private DatabaseConnectionPool() {
        connectionPool = new ArrayList<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            connectionPool.add(new ConnectionStub());
        }
    }

    // Public method to provide access to the instance
    public static DatabaseConnectionPool getInstance() {
    	DatabaseConnectionPool result = instance;
    	if (result == null) {
    		synchronized (DatabaseConnectionPool.class) {
    			result = instance;
    			if (result == null) {
    				instance = result = new DatabaseConnectionPool();
    			}
    		}
        }
        return result;
    }

    // Method to get a connection from the pool
    public synchronized Connection getConnection() {
        if (connectionPool.isEmpty()) {
            throw new RuntimeException("No available connections.");
        }
        return connectionPool.remove(connectionPool.size() - 1);
    }

    // Method to return a connection to the pool
    public synchronized void returnConnection(Connection connection) {
        connectionPool.add(connection);
    }
}
