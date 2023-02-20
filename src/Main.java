import metodosParaOBancoDeDados.CreateDatabase;
import metodosParaOBancoDeDados.Insert;
import metodosParaOBancoDeDados.Select;
import telas.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        menu.showOptions();
        Scanner getInput = new Scanner(System.in);
        int option = getInput.nextInt();
        if (option == 1) {
            var incluirMenu = new IncluirItem();
            incluirMenu.askForProductName();
        } else if (option == 2) {
            var excluirMenu = new ExcluirItem();
            excluirMenu.askForProductID();
        }
        else if (option == 3) {
            var databaseTableSelectAll = new Select();
            databaseTableSelectAll.selectAll();
        } else {
            System.out.println("Digite uma opção válida");
        }

    }
}