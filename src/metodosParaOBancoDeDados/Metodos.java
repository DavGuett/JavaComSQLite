package metodosParaOBancoDeDados;

import java.sql.*;

public class Metodos {
    public static void criarBanco(String nomeDoBanco) {
        String url = "jdbc:sqlite:db/" + nomeDoBanco;
        try (Connection conexao = DriverManager.getConnection(url)){
            if (conexao != null) {
                DatabaseMetaData metaDados = conexao.getMetaData();
                System.out.println("O nome do driver do banco é " + metaDados.getDriverName());
                System.out.println("Um novo banco de dados foi criado");
            }
        } catch (SQLException mensagem) {
            System.out.println(mensagem.getMessage());
        }
        try (Connection conexao = DriverManager.getConnection(url)){
            Statement comandoSQL = conexao.createStatement();
            comandoSQL.execute("CREATE TABLE IF NOT EXISTS produtos" +
                    "(id INTEGER PRIMARY KEY, nome VARCHAR)");
            // inserção inicial no banco para teste
            comandoSQL.execute("INSERT INTO produtos (nome) VALUES ('Jornal')");
            comandoSQL.execute("SELECT * FROM produtos");
        } catch (SQLException mensagem) {
            System.out.println(mensagem.getMessage());
        }
    }
}
