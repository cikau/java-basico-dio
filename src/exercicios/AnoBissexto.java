package exercicios;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEste programa verifica se um ano é bissexto.\n");
        System.out.println("Digite um ano (a partir de 1585): ");
        int ano = scanner.nextInt();

        if (ano > 1584 && ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("É Ano Bissexto.");
        } else {
            System.out.println("Não é Ano Bissexto.");
        }
        scanner.close();

    }
}

/*
Para estruturas de controle compostas, ou seja, com muitos operadores,
devemos separar cada sentença lógica por parênteses, como em:
(ano > 1584 && ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
 */
