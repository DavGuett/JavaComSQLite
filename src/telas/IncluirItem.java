package telas;

import metodosParaOBancoDeDados.Insert;

import java.util.Scanner;

public class IncluirItem {
    public void askForProductName() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Escreva o nome do produto que deseja incluir: ");
        String nomeProduto = getInput.nextLine();
        var insertProduct = new Insert();
        insertProduct.insertInto(nomeProduto);
    }
}
