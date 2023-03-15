package dbMethods;

import java.sql.*;

public class Select {
    private Connection connect(){
        String url = "jdbc:sqlite:db/testando.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
        return connection;
    }
    public void selectAll(){
        String sqlCommand = "SELECT * FROM Produtos";
        try (Connection connection = this.connect();
             Statement sqlStatement = connection.createStatement();
             ResultSet resultSet = sqlStatement.executeQuery(sqlCommand)){

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +" " +resultSet.getString("nome"));
            }
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }


    }
}
