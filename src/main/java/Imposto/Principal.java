package Imposto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        scanner.close();

        Pessoa pessoa = new Pessoa(nome, salario);
        ImpostoDeRenda ir = new ImpostoDeRenda(pessoa);
        ir.imprimir();
    }
}

