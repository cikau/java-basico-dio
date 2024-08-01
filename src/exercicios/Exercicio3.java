package exercicios;

public class Exercicio3 {

    public static void main(String[] args) {

   //EXERCICIOS COM ESTRUTURAS DE CONTROLE

    //1) imprimir números de 150 a 300.
         int valor = 150;
         while (valor <= 300) {
        System.out.println(valor);
        valor++;
    }

        /*
        FORMA ALTERNATIVA:

         for (int valor = 150; valor <= 300; valor++) {
        System.out.println(valor);
         }
         */

    // Imprimir a soma de 1 até 1000.
        int soma = 0;
        for (int i = 1; i <=1000; i++) {
        soma += i;
        System.out.println("A soma dos números entre 1 e 1000 é: "+ soma);
    }


    // Imprimir todos os múltiplos de 3, entre 1 e 100
        for (int numerozinho = 3; numerozinho <=100; numerozinho++) {
        if (numerozinho % 3 == 0) {
            System.out.println(numerozinho);
        }
    }

    // Imprima os fatoriais de 1 a 10. Fatorial = n * (n-1) * (n - 2)... O fatorial de 1 = 1.
        for (int number = 1; number <= 10; number++) {
        long fatorial = 1;
        for (int j = 1; j <= number; j++) { //a variável j faz com que os números sejam multiplicados por 1, 2, 3, 4..., como se fosse Numero! (fatorial)
            fatorial *= j;
        }
        System.out.println("O fatorial de " + number + " é: " + fatorial);

        }
    }
}