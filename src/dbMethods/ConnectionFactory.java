package dbMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    protected static Connection connect(){
        String url = "jdbc:sqlite:db/testando.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
        return connection;
    }
}
