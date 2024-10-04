package aulas;

import org.w3c.dom.ls.LSOutput;

public class Aula2 {
    /*
 OPERADORES: símbolos especiais com um significado próprio para a linguagem,
 sendo associados a determinadas operações.

 OPERADOR DE ATRIBUIÇÃO: O operador de atribuição é utilizado para definir
 o valor inicial ou sobrescrever o valor de uma variável. Em Java, o operador
 de atribuição é o igual " = " .


OPERADORES ARITMÉTICOS: para operações matemáticas.

" + " Soma
" - " Subtração
" / " Divisão inteira
" * " Multiplicação
" % " Resto de uma divisão inteira
" = " Operador de atribuição (guarda um valor na variável)

OBS¹: uma variável soma = soma + x também pode ser escrita assim: soma += x.
O mesmo é válido para os outros operadores aritméticos ( - / e * )

OBS²: o operador de adição " + ", quando utilizado em variáveis do tipo texto (String),
realizará a concatenação dos textos (ou seja, vai unir os textos na sentença). Também
pode concatenar números, desde que estejam entre aspas numa String.


OPERADORES UNÁRIOS: são aplicados juntamente com um operador aritmético,
realizando trabalhos como incrementar, decrementar, inverter valores numéricos
e booleanos.
"+" positiva os valores
"-"  negativa os valores
"++" incrementa/aumenta o valor da variável em uma unidade
"--" decrementa/reduz o valor da variável em uma unidade
" ! " operador lógico de negação, que nega o valor de uma expressão booleana

OBS: Incremento --> i++, ++i e i = i + 1 são incrementos, ou seja, comandos
que aumentam o valor de uma variável de tipo numérico.

OPERADORES RELACIONAIS

" < "  Menor que
" > "  Maior que
" <= " Menor ou igual a
" >= " Maior ou igual a
" == " igual a
" != "  diferente de

OBS: OPERADOR TERNÁRIO --> é uma forma resumida para resumir uma condição
e escolher um dentre dois valores. Representado por " ? : ".
Assim:

expressão condicional ? comando caso seja verdadeira : comando caso seja falsa


OPERADORES LÓGICOS: permitem criar expressões lógicas maiores, a partir da
junção de duas ou mais expressões.

" && " operador lógico "E" --> Verdadeira APENAS se todas as expressões forem Verdadeiras
" || " operador lógico "OU" --> Falsa APENAS se todas as expressões forem Falsas


*/

    public static void main(String[] args) {

        //SOMA
        double parcela1 = 7.5;
        double parcela2 = 9.8;
        double soma = parcela1 + parcela2;
        System.out.println("7.5 + 9.8 = " + soma);

        // SUBTRAÇÃO
        double subtraendo = 7.5;
        double minuendo = 9.8;
        double subtracao = minuendo - subtraendo;
        System.out.println("9.8 - 7.5 = " + subtracao);

        //MULTIPLICAÇÃO
        double fator1 = 7.5;
        double fator2 = 9.8;
        double multiplicacao = fator1 * fator2;
        System.out.println("7.5 * 9.8 = " + multiplicacao);

        //DIVISÃO
        double divisor1 = 7.5;
        double dividendo1 = 9.8;
        double divisao = dividendo1 / divisor1;
        System.out.println("9.8 / 7.5 = " + divisao);

        //RESTO DA DIVISÃO
        int dividendo2 = 8;
        int divisor2 = 3;
        int resto = dividendo2 % divisor2;
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

        //CONCATENAÇÃO
        String nomeCompleto = "Cintia " + "Uz";
        System.out.println(nomeCompleto);
        String numerosConcatenados = "1" + "1";
        System.out.println(numerosConcatenados);

        //UNÁRIOS
        int cincoNegativo = 5;
        cincoNegativo = - cincoNegativo;
        System.out.println(cincoNegativo);

        int cincoPositivo = -5;
        cincoPositivo = -cincoPositivo; //cincoPositivo * -1 (um número negativo * -1 torna-se positivo)
        System.out.println(cincoPositivo);

        //INCREMENTO
        int numberOne = 1;
        System.out.println(numberOne++); //não imprime logo o valor atualizado
        System.out.println(numberOne);
        //o incremento ++numberOne no system.out imprime logo o valor atualizado
        System.out.println(++numberOne);
        //numberOne++; é o mesmo que numberOne + numberOne + 1;
        //O mesmo vale para o decremento --

        //NEGANDO OU INVERTENDO O VALOR DE UMA VARIÁVEL BOOLEANA
        boolean terraRedonda = false;
        terraRedonda = !terraRedonda; //ou poderíamos apenas trocar o valor da variável por "true"
        System.out.println(terraRedonda);

        //OPERADOR TERNÁRIO:
        int a, b;
        a = 5;
        b = 6;
        String resultadosTexto = a == b ? "verdadeiro" : "falso";
        System.out.println(resultadosTexto);

        int resultadosNumericos = a == b ? 1 : 0;
        System.out.println(resultadosNumericos);

        //OPERADORES RELACIONAIS:
        int numeroUm = 3;
        int numeroDois = 4;
        boolean simNao = numeroUm == numeroDois;
        System.out.println(simNao);

        simNao = numeroUm != numeroDois;
        System.out.println(simNao);

        simNao = numeroUm > numeroDois;
        System.out.println(simNao);

        simNao = numeroUm < numeroDois;
        System.out.println(simNao);

        String nome1 = "Gleyson";
        String nome2 = "Gleyson";
        System.out.println(nome1 == nome2);

        //PARA COMPARAR OBJETOS, UTILIZAMOS O COMANDO .EQUALS
        String nome3 = new String("Gleyson");
        System.out.println(nome1.equals(nome3));

    }
}

//OBS: String NÃO É um tipo primitivo, mas um OBJETO em Java.