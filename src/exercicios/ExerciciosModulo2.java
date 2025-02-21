package exercicios;

import java.util.Scanner;

public class ExerciciosModulo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Programa para cálculo da soma de 10 números digitados pelo usuário
        double numero, soma;
        int contador = 0;
        soma = 0;
        while (contador < 10) {
            System.out.println("Digite um número: ");
            numero = scanner.nextDouble();
            soma = soma + numero;
            contador = contador + 1;
        }
        System.out.println("A soma dos números digitados é igual a: " + soma);
    }

}
