package metodosParaOBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
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

    public void insertInto(String nome) {
        String sqlCommand = "INSERT INTO Produtos(nome) VALUES (?)";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)){
                preparedStatement.setString(1, nome);
                preparedStatement.executeUpdate();
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
    }
}
