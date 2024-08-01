package aulas;

public class Aula2 {
    /*
OPERADORES ARITMÉTICOS

+ Soma
- Subtração
/ Divisão inteira
* Multiplicação
% Resto de uma divisão inteira
= Operador de atribuição (guarda um valor)

OBS: uma variável soma = soma + x também pode ser escrita assim: soma += x.
O mesmo é válido para os outros operadores aritméticos ( - / e * )

OPERADORES CONDICIONAIS

< Menor que
> Maior que
<= Menor ou igual a
>= Maior ou igual a
== igual a
!= diferente de

OBS: Incremento --> i++, ++i e i = i + 1 são incrementos, ou seja, comandos
que aumentam o valor de uma variável de tipo numérico.
*/

    public static void main(String[] args) {

        //SOMA
        double numero1Soma = 7.5;
        double numero2Soma = 9.8;
        double soma = numero1Soma + numero2Soma;
        System.out.println("7.5 + 9.8 = " + soma);

        // SUBTRAÇÃO
        double numero1Subtracao = 7.5;
        double numero2Subtracao = 9.8;
        double subtracao = numero2Subtracao - numero1Subtracao;
        System.out.println("9.8 - 7.5 = " + subtracao);

        //MULTIPLICAÇÃO
        double numero1Mult = 7.5;
        double numero2Mult = 9.8;
        double multiplicacao = numero1Mult * numero2Mult;
        System.out.println("7.5 * 9.8 = " + multiplicacao);

        //DIVISÃO
        double numero1Div = 7.5;
        double numero2Div = 9.8;
        double divisao = numero2Div / numero1Div;
        System.out.println("9.8 / 7.5 = " + divisao);

        //RESTO DA DIVISÃO
        int numero1Resto = 8;
        int numero2Resto = 3;
        int resto = numero1Resto % numero2Resto;
        System.out.println("O resto da divisão entre 8 e 3 = " + resto);

        //INCREMENTO
        int i = 0;
        System.out.println("O valor inicial de i é = " + i);
        i++;
        System.out.println("Agora i é = " + i);
        ++i;
        System.out.println("Agora i é = " + i);
        i = i + 1;
        System.out.println("Agora i é = " + i);

    }
}
