package dbMethods;

import java.sql.*;

public class Select {
    public void selectAll(){
        String sqlCommand = "SELECT * FROM Produtos";
        try (Connection connection = ConnectionFactory.connect();
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
