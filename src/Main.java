import metodosParaOBancoDeDados.CreateDatabase;
import metodosParaOBancoDeDados.Insert;
import metodosParaOBancoDeDados.Select;
import telas.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var databaseTableSelectAll = new Select();
        databaseTableSelectAll.selectAll();
        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        menu.showOptions();
        Scanner getInput = new Scanner(System.in);
        int option = getInput.nextInt();
        if (option == 1) {
            var incluirMenu = new IncluirItem();
            incluirMenu.askForProductName();
        }

    }
}