import telas.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import metodosParaOBancoDeDados.Metodos;
public class Main {

    public static void main(String[] args) {
        var criaBanco = new Metodos();
        criaBanco.criarBanco("testando.db");

        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        menu.mostrarOpcoes();

    }
}