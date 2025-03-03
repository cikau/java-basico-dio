package exercicios;
import java.util.Scanner;
/*
A repetição controlada por Flag é uma técnica de programação que usa uma
variável booleana (a "flag") para controlar se um loop deve continuar ou
parar.
 */
public class Flag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; //inicialização da flag

        while (continuar) { //condição do loop
            System.out.println("Digite um número inteiro (negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                continuar = false; //alteração da flag
            } else {
                System.out.println("Número digitado: " + numero);
            }
        }
        System.out.println("Fim do programa");
        scanner.close();
    }
}

/*
O programa acima vai continuar recebendo os números inteiros que o usuário
digitar, até que ele digite um número inteiro negativo. Quando isso ocorrer,
o looping vai parar e o programa será encerrado.
 */
