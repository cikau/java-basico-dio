package exercicios;

import java.util.Scanner; //informando que vamos usar o Scanner neste programa

public class TestandoScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //chamando o objeto Scanner

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next( );

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next( );

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt( );

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble( );

        //imprimindo os dados inseridos pelo usuário:
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("A minha altura é " + altura + " cm.");

        scanner.close(); //devemos fechar a classe para evitar vazamentos de recursos

    }

}
