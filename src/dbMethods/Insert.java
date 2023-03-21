package dbMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public void insertInto(String nome) {
        String sqlCommand = "INSERT INTO Produtos(nome) VALUES (?)";
        try (Connection connection = ConnectionFactory.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)){
                preparedStatement.setString(1, nome);
                preparedStatement.executeUpdate();
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
    }
}
