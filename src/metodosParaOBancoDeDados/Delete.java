package metodosParaOBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private Connection connect() {
        String url = "jdbc:sqlite:db/testando.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
        return connection;
    }

    public void deleteFrom(int id) {
        String sqlCommand = "DELETE FROM Produtos WHERE id = ?";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)){
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
    }
}
