package telas;

import java.util.Scanner;

public class IncluirItem {
    public void askForProductName() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Escreva o nome do produto que deseja incluir: ");
        String nomeProduto = getInput.nextLine();
        System.out.println(nomeProduto);
    }
}
