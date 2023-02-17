package metodosParaOBancoDeDados;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    }
}
