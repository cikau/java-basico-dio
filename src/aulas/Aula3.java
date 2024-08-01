package aulas;

public class Aula3 {

    /*
ESTRUTURAS DE CONTROLE: IF E ELSE

if (condição booleana) {
comando a ser executado SE a condição for Verdadeira
}

if (condição booleana) {
comando a ser executado SE a condição for Verdadeira
} else {
comando a ser executado CASO a condição seja falsa
}

if (condição1) {
comando a ser executado SE a condição 1 for Verdadeira
} else if (condição 2) {
comando a ser executado CASO a condição 2 seja verdadeira
} else {
comando a ser executado CASO as condições anteriores sejam Falsas
}

***Em vez do ELSE IF, pode-se usar apenas o IF, quantas vezes forem
necessárias.

Switch (variável) {
caso 1:
       comando;
      break;
caso 2:
       comando;
       break;
}

CONCATENANDO EXPRESSÕES BOOLEANAS

&& --> e
|| --> ou
== --> igual a
! --> negação
!= --> diferente de

ESTRUTURAS DE REPETIÇÃO

WHILE: repete o comando enquanto a condição for verdadeira.
int idade 15;
while (idade < 18) {
System.out.println(idade);
idade = idade + 1;
}

FOR: mesma ideia do While, porém com um espaço para inicialização de variáveis e modificador.
for (inicialização; condicao; incremento) {
comando;
}

***Podemos usar os termos BREAk (para interromper o looping/laço atual) e CONTINUE (para continuar o próximo laço).
EX:
for (int i = x; i < y; i++) {
if (i % 19 == 0) {
System.out.println("Achei um número divisível por 19 entre x e y");
break;
}
}

for (int i = 0; i < 100; i++) {
if (i > 50 && i < 60) {
continue;
}
System.out.println(i);
}

DO...WHILE: serve para executar um comando enquanto uma condição é avaliada.
do {
comandos aqui
}
while (condição);

OBS:
OPERADORES DE INCREMENTO --> i++ ou ++i ou +=
OPERADORES DE DECREMENTO --> i-- ou --i ou -=

OBS2: ESCOPO DA VARIÁVEL --> nome dado ao trecho de código em que
determinada variável existe e o lugar onde é possível acessá-la.

UM BLOCO DENTRO DO OUTRO: também é possível usar várias estruturas,
uma dentro da outra:

while (condicao) {
for (int i = 0; i < 10; i++) {
código aqui
  }
}
*/
    public static void main(String[] args) {

        //EXEMPLOS DE ESTRUTURAS DE CONTROLE:

        //IF
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior do que 5");
        }
        System.out.println("O número é: " + numero);

        //IF... ELSE
        int numeroInteiro = 4;

        if (numeroInteiro > 5) {
            System.out.println("O número é maior do que 5.");
        } else {
            System.out.println("O número é igual a ou menor do que 5.");
        }

        //IF...ELSE IF...ELSE
        int numeroInteiro2 = 5;

        if (numeroInteiro2 > 5) {
            System.out.println("O número é maior do que 5.");
        } else if (numeroInteiro2 == 5) {
            System.out.println("O número é igual a 5.");
        } else {
            System.out.println("O número é menor que 5.");
        }

        //SWITCH
        int valor = 5;

        switch (valor) {
            case 1:
                System.out.println("É o número um");
                break;
            case 3:
                System.out.println("É o número três");
                break;
            case 5:
                System.out.println("É o número cinco");
                break;
        }

        //CONCATENANDO EXPRESSÕES BOOLEANAS
        //verificar a idade de alguém E ver se ele é amigo do dono do bar. Só NÃO pode entrar se a idade for < 18 E não for amigo do dono
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar.");
        } else {
            System.out.println("Pode entrar.");
        }

        //EXEMPLO DE WHILE
        int e = 0;
        while (e < 10) {
            System.out.println(e);
            e = e + 1;
        }

        //EXEMPLO DE FOR: equivalente ao exemplo de while acima
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Olá!");
        }
        /*
        Com WHILE seria:
        int i = 0
        while (i < 10) {
        System.out.println("Olá!");
        i = i + 1;
        }
         */

        //EXEMPLO DE DO...WHILE:
        int inteiro = 0;
        do {
            System.out.println(inteiro);
            inteiro++;
        }
        while (inteiro < 5);

        //EXEMPLO DE INCREMENTOS
        int numeroQualquer = 10;
        int posIncremento = numeroQualquer++;
        System.out.println("O número era 10, mas ficou: " + numeroQualquer + "\nNa outra variável, continua: " + posIncremento);

        int algumNumero = 10;
        int preIncremento = ++algumNumero;
        System.out.println("O número era 10, mas ficou: " + algumNumero + " \nNa outra variável, mudou também para: " + preIncremento);

    }
}

