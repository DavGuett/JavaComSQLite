import telas.*;
import metodosParaOBancoDeDados.Metodos;
public class Main {

    public static void main(String[] args) {
        var databaseMethods = new Metodos();
        databaseMethods.createDatabase("testando.db");

        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        menu.showOptions();

    }
}