package exercicios;

public class Exercicio1 {

    /* EXERCÍCIO 1:
       A) Escreva um programa que declare uma variável do tipo double e uma
       variável do tipo int. Atribua à variável double o valor de 10.5 e, a seguir,
       coverta esse valor para int e armazene na variável int. Imprima o valor
       resultante.

       B) Escreva um programa que declare uma variável do tipo int e uma variável
       do tipo double. Atribua à variável do tipo int o valor de 5 e à variável do tipo
       double o valor 7.8. Converta a variável int para double e some-a com a
       variável double. Imprima o resultado.

       C) Escreva um programa que declare uma variável String e uma variável do
       tipo int. Atribua à variável String o valor "123" e, em seguida, converta esse
       valor para int e armazene na variável int. Imprima o valor resultante.

       D) Escreva um programa que declare uma variável do tipo double e uma do
       tipo int. Atribua à double 9.75 e, em seguida, converta esse valor para int
       e armazene na variável int. Imprima o valor resultante.

       E) Escreva um programa que declare uma variável do tipo int e uma do tipo
       char. Atribua à int o valor 97 e converta esse valor para char, armazenando-o
       em char. Imprima o valor resultante.

       */

    public static void main(String[] args) {

        //A)
        double dezPontoCinco = 10.5d;
        int dezRedondo = (int) dezPontoCinco;
        System.out.println(dezRedondo);

        //B)
        int cinco = 5;
        double setePontoOito = 7.8d;
        double cincoPonto = (double) cinco;
        /*
        RESOLUÇÃO ALTERNATIVA:
        double soma1 = setePontoOito + cincoPonto;
        System.out.println(soma1);
        */
        System.out.println(setePontoOito + cincoPonto);

        //C)
        String umDoisTres = "123";
        int oneTwoThree = Integer.parseInt(umDoisTres);
        System.out.println(oneTwoThree);

        //D)
        double novePontoSetentaCinco = 9.75d;
        int noveRedondo = (int) novePontoSetentaCinco;
        System.out.println(noveRedondo);

        //E)
        int noventaSete = 97;
        char caractere = (char) noventaSete;
        System.out.println(caractere);

        //BÔNUS:
        int numeroQualquer = 88;
        String numeroEscrito = String.valueOf(numeroQualquer);
        System.out.println(numeroEscrito);

        float numeroDecimal = 8.7f;
        String decimalEscrito = String.valueOf(numeroDecimal);
        System.out.print(decimalEscrito);

    }
}
