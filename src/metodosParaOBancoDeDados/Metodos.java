package metodosParaOBancoDeDados;

import java.sql.*;

public class Metodos {
    public static void createDatabase(String database) {
        String url = "jdbc:sqlite:db/" + database;
        try (Connection connection = DriverManager.getConnection(url)){
            if (connection != null) {
                DatabaseMetaData metaData = connection.getMetaData();
                System.out.println("O nome do driver do banco é " + metaData.getDriverName());
                System.out.println("Um novo banco de dados foi criado");
            }
        } catch (SQLException message) {
            System.out.println(message.getMessage());
        }
        try (Connection connection = DriverManager.getConnection(url)){
            Statement sqlCommand = connection.createStatement();
            sqlCommand.execute("CREATE TABLE IF NOT EXISTS produtos" +
                    "(id INTEGER PRIMARY KEY, nome VARCHAR)");
            // inserção inicial no banco para teste
            sqlCommand.execute("INSERT INTO produtos (nome) VALUES ('Jornal')");
            sqlCommand.execute("SELECT * FROM produtos");
        } catch (SQLException mensagem) {
            System.out.println(mensagem.getMessage());
        }
    }
}
