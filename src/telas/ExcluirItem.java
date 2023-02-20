package telas;

import metodosParaOBancoDeDados.Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirItem {
    public void askForProductID() {
       Scanner getInput = new Scanner(System.in);
       System.out.println("Digite o ID do produto a ser excluído: ");
       int produtoID = getInput.nextInt();
       var deleteProduct = new Delete();
       deleteProduct.deleteFrom(produtoID);
    }
}
