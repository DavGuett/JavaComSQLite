import metodosParaOBancoDeDados.Select;
import telas.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo!");
        System.out.println("-------------------");
        var menu = new Menu();
        boolean run = true;
        while(run) {
            menu.showOptions();
            Scanner getInput = new Scanner(System.in);
            int option = getInput.nextInt();
            if (option == 1) {
                var incluirMenu = new AddItem();
                incluirMenu.askForProductName();
            } else if (option == 2) {
                var excluirMenu = new DeleteItem();
                excluirMenu.askForProductID();
            }
            else if (option == 3) {
                var databaseTableSelectAll = new Select();
                databaseTableSelectAll.selectAll();
            } else if (option == 4){
                System.out.println("Saindo...");
                run = false;
            }
            else {
                System.out.println("Digite uma opção válida");
            }

        }
        }

}