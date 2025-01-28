package aulas;

import java.util.Scanner;

public class Aula5 {

    /*
    Este curso de programação em Java está sendo continuado pelo IFRS

EXEMPLO DE PROGRAMA EM PSEUDOCÓDIGO OU PORTUGOL

Algoritmo "Notas de um aluno"

var
N1, N2, N3. N4. RES: real

início

leia N1, N2, N3, N4
RES <- (N1 + N2 + N3 + N4) / 4
escreva RES

fim

ESTRUTURA DE CONTROLE EM PSEUDOCÓDIGO

se teste então
    conjunto de instruções 1
senão
    conjunto de instruções 2
fim se

As palavras "se, então", "senão" e "fim se" são palavras-chaves que delimitam
a estrutura de controle.

Algoritmo "Média das notas de um aluno"

var
N1, N2, N3. N4. RES: real

início

leia N1, N2, N3, N4
RES <- (N1 + N2 + N3 + N4) / 4
escreva RES

Se RES >= 7 então
    escreva "Aprovado"
Senão
    escreva "Reprovado"
fim se

fim

TAMBÉM É POSSÍVEL OMITIR O "SENÃO"

Algoritmo "É zero" //esse algoritmo só retorna se a pessoa tiver digitado 0 como valor

var
numero: inteiro

início

leia numero
se numero = 0 então
escreva "Você digitou zero"

fim se

escreva numero

fim

OPERADORES LÓGICOS EM PSEUDOCÓDIGO

Algoritmo "Verifica conceito"

var
conceito: caractere

início
leia conceito

se conceito <> 'A' e conceito <> 'B' e conceito <> 'C' então
escreva "Conceito inválido"
fim se

se conceito = 'A' ou conceito = 'B' então
escreva "Aluno aprovado"
fim se

se conceito = "C" então
escreva "Aluno reprovado"
fim se

fim

PARA NEGAR O VALOR LÓGICO, USAMOS !

se (conceito != 'C')  //entre parênteses

LISTA DE PRECEDÊNCIA DE OPERADORES (QUEM TEM MAIOR PRIORIDADE)

0) Parênteses
1) NÃO -> negação
2) multiplicação * e divisão / ou mod div
3) + -  -> soma + e subtração -
4) maior > , maior ou igual >= , menor < , menor ou igual <=
5) operador de igualdade =, diferença <> ou !=
6) E  -> conjunção
7) OU  -> disjunção

OBS:
Para atribuir valores às variáveis -> = (operador de atribuição)
Para comparar valores -> == (operador de igualdade)

JAVA x PSEUDOCÓDIGO:

if -> se teste então
else -> senão

     */

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, n4, resposta;

        System.out.println("Informe a sua nota do primeiro bimestre:");
        n1 = scanner.nextDouble();
        System.out.println("Informe a sua nota do segundo bimestre:");
        n2 = scanner.nextDouble();
        System.out.println("Informe a sua nota do terceiro bimestre:");
        n3 = scanner.nextDouble();
        System.out.println("Informe a sua nota do quarto bimestre:");
        n4 = scanner.nextDouble();
        resposta = (n1 + n2 + n3 + n4) / 4;

        scanner.close();

        System.out.printf("Sua média escolar foi igual a %f", resposta);
        System.out.println("\nSTATUS DO ALUNO: ");
        if (resposta >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
