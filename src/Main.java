import metodosParaOBancoDeDados.CreateDatabase;
import metodosParaOBancoDeDados.Insert;
import metodosParaOBancoDeDados.Select;
import telas.*;
public class Main {

    public static void main(String[] args) {
        var databaseTableSelectAll = new Select();
        databaseTableSelectAll.selectAll();
        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        menu.showOptions();

    }
}