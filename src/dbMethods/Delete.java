package dbMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public void deleteFrom(int id) {
        String sqlCommand = "DELETE FROM Produtos WHERE id = ?";
        try (Connection connection = ConnectionFactory.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)){
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
    }
}
