package aulas;

import java.sql.SQLOutput;

public class Aula3 {

    /*
CONTROLE DE FLUXO

 ESTRUTURAS CONDICIONAIS: if-else e switch-case

**CONDICIONAL SIMPLES:
if (condição booleana) {
comando a ser executado SE a condição for Verdadeira
}

**CONDICIONAL COMPOSTA:
if (condição booleana) {
comando a ser executado SE a condição for Verdadeira
} else {
comando a ser executado CASO a condição seja falsa
}

**CONDICIONAL ENCADEADA:
if (condição1) {
comando a ser executado SE a condição 1 for Verdadeira
} else if (condição 2) {
comando a ser executado CASO a condição 2 seja verdadeira
} else {
comando a ser executado CASO as condições anteriores sejam Falsas
}

***Em vez do ELSE IF, pode-se usar apenas o IF, quantas vezes forem
necessárias.

**CONDIÇÃO TERNÁRIA: uso do ? : para abreviar as condições. Antes da
?, colocamos a condição principal seguida do código a ser executado, caso ela
seja verdadeira. E, após os :, colocamos o código a ser executado se a
condição for falsa.

EX:
public static void main(Strings[ ] args) {
int nota = 7;
String resultado = nota >= 7 ? "Aprovado" : "Reprovado;
System.out.println(resultado);
}

**SWITCH-CASE: essa estrutura compara o valor de cada caso com o da variável,
sequencialmente, e sempre que encontra um valor correspondente, executa o
código associado ao caso. Acrescentamos o comando BREAK ao final de cada
bloco de códigos para evitar que as comparações continuem a ser executadas
após um caso correspondente ter sido encontrado.

EX:
Switch (variável) {
caso 1:
       comando;
      break;
caso 2:
       comando;
       break;
 default:
       comando;
}

***OBS: concatenando expressões booleanas.

&& --> e
|| --> ou
== --> igual a
! --> negação
!= --> diferente de

ESTRUTURAS DE REPETIÇÃO: for, while, do-while

WHILE (enquanto): repete o comando enquanto a condição for verdadeira.
Primeiro avalia, depois executa.

int idade 15;
while (idade < 18) {
System.out.println(idade);
idade = idade + 1;
}

FOR (para): mesma ideia do While, porém com um espaço para inicialização de
variáveis e modificador.
for (inicialização; validação ou condição; incremento) {
comando que será executado até que a condição/validação se torne falsa;
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

DO...WHILE (faça, enquanto): serve para executar um comando enquanto
uma condição é avaliada. Executa primeiro, depois avalia.
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

ESTRUTURAS DE EXCEÇÃO: try-catch-finally, throw

**EXCEÇÕES: ao executar o código Java, diferentes erros podem acontecer:
erros de codificação feitos pelo programador, erros de entrada etc.
Exceções NÃO são erros, mas os comportamentos não previstos e/ou
 não desejados do nosso programa. Ao prever tais exceções, para evitar que
 elas aconteçam, o desenvolvedor estará implementando o Tratamento de
 Exceções.

 NOME DE ALGUMAS EXCEÇÕES EM JAVA:

**java.lang.NullPointerException: ocorre quando tentamos obter alguma info
de uma variável nula.

**java.lang.ArithmeticException: ocorre quando tentamos dividir um valor por
zero.

**java.sql.SQLException: ocorre quando existe algum erro relacionado à
interação com banco de dados.

**java.io.FileNotFoundException: ocorre quando tentamos ler ou escrever
em um arquivo inexistente.

TRATAMENTO DE EXCEÇÕES EM JAVA:

--> Try: essa instrução permite que você defina um bloco de código para ser
testado quanto a erros, enquanto está sendo executado.

--> Catch: essa instrução permite definir um bloco de código a ser executado
caso ocorra um erro no bloco "try".

--> Finally (opcional): essa instrução permite definir um bloco de código a ser executado,
independentemente de ocorrer um erro ou não.

**OBS: "try" e "catch" vêm em pares. "Finally" é opcional.

ESTRUTURA DE UM BLOCO TRY...CATCH:

try {
//bloco de código conforme o que se espera que aconteça
}
catch (Exception nomeDaExceção) {
//bloco de código que captura as exceções que podem ocorrer
}

EXEMPLO DE TRATAMENTO DE EXCEÇÕES NO ARQUIVO "EstruturasExcepcionais"

HIERARQUIA DE DAS EXCEÇÕES: a linguagem Java possui uma variedade de
classes que representam exceções. Essas classes são dispostas em uma hierarquia
e chamadas de "Checked and Unchecked Exceptions". O que determina se uma
exceção é "checked" ou "unchecked" é o risco de ela ser disparada e ser, logo, tratada.

EXCEÇÕES CUSTOMIZADAS: podemos criar classes de exceções que tenham
mais a ver com a aplicação.

**Criando uma Classe de Exceção:
public class NomeDaExcecao extends Exception { }

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

        //CONDIÇÃO TERNÁRIA
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

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
            default:  //NÃO é obrigatório
                System.out.println("INDEFINIDO");
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

        **FOR EM ARRAYS: usamos o FOR também para interagir sobre arrays
        e coleções. Em arrays, os elementos ficam numa coleção e cada um se encontra
        em um índice. O índice de um array sempre começa em zero. Usamos aqui
        o FOR...EACH.
        EX:
        public class ExemploFor {
        public static void main(String[ ] args) {
        String alunos[ ] = {"Felipe", "Jonas", "Júlia", "Marcos"};

        for (int x = 0; x < alunos.length; x++) {
        System.out.println("O aluno do índice X = " + x + " é " + alunos[x] );
        }
         }
        }

OU com o FOR...EACH

     public class ExemploFor {
        public static void main(String[ ] args) {
        String alunos[ ] = {"Felipe", "Jonas", "Júlia", "Marcos"};

    for (String aluno : alunos) {
    System.out.println("Nome do aluno é " + aluno);
       }
      }
    }
         */

        //EXEMPLO DO FOR...EACH
        String alunos[ ] = {"Felipe", "Jonas", "Júlia", "Marcos"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

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

/*
CONCEITOS IMPORTANTES

--> BREAK: interrompe um laço de repetição.

--> CONTINUE: interrompe a iteração atual.

 */
        //EXEMPLO BREAK
        System.out.println("EXEMPLO DE BREAK");
        for (int contagem = 1; contagem <= 5; contagem++){
            if(contagem ==3)
                break; //o break interrompe a contagem antes de chegar em 3
            System.out.println(contagem);
        }

//EXEMPLO CONTINUE
        System.out.println("EXEMPLO DE CONTINUE");
for (int numeracao = 1; numeracao <= 5; numeracao++) {
    if (numeracao == 3)
        continue; //retira o 3 da contagem, mas continua contando após o 3
    System.out.println(numeracao);
}

    }
}



