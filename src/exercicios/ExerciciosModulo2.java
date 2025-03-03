package exercicios;

import java.util.Scanner;

public class ExerciciosModulo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/* 1) Faça um programa que calcule a soma de dez números quaisquer
fornecidos pelo usuário */
   /*     double numero, soma;
        int contador = 0;
        soma = 0;
        while (contador < 10) {
            System.out.println("Digite um número: ");
            numero = scanner.nextDouble();
            soma = soma + numero;
            contador = contador + 1;
        }
        System.out.println("A soma dos números digitados é igual a: " + soma);
  */
    /*
    2)  Faça um programa que calcule o somatório, a soma dos quadrados e a
média entre os n primeiros números inteiros positivos.

        int n, somatorio, somaQuadrados, i;
        System.out.println("Digite um número inteiro: ");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Digite um número inteiro POSITIVO e diferente de zero: ");
        }
        somatorio = 0;
        somaQuadrados = 0;
        i = 1; //contador
        while (i <= n) {
           somatorio = somatorio + i;
           somaQuadrados += i * i;
           i = i + 1;
        }
        double media = (double) somatorio/n;
        System.out.println("Somatório dos " + n + " primeiros números: " + somatorio);
        System.out.println("Soma dos quadrados dos " + n + " primeiros números: " + somaQuadrados);
        System.out.println("Média dos " + n + " primeiros números: " + media);

        scanner.close();

    3) Crie um programa Java para exibir os quadrados de números digitados
pelo usuário, até que ele digite um número negativo.


        int numero, quadrado;
        System.out.println("Digite um número inteiro e diferente de zero: ");
        numero = scanner.nextInt();

        while (numero > 0) {
        quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é igual a " + quadrado);

            System.out.println("Digite um número inteiro e diferente de zero: ");
            numero = scanner.nextInt();

        }

        if (numero <= 0) {
            System.out.println("Programa encerrado.");
        }

4) Faça um programa que receba várias idades, calcule e mostre a média
das idades digitadas. Finalize digitando idade igual a zero.
 */
int idade, soma, media, i;
soma = 0;
        System.out.println("Digite uma idade qualquer diferente de zero: ");
        idade = scanner.nextInt(); 

    }
}
