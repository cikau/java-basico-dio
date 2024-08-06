package aulas;

public class Aula1 {

    /*COMENTÁRIOS EM JAVA: podem ser feitos com barra inclinada e asterisco,
     abrindo e fechando a citação (para citações com mais de uma linha).
     */
    //Ou com duas barras inclinadas antes de iniciar a citação, para citações de uma linha apenas

/*
    ANATOMIA DE UMA CLASSE:  ddd

    public class NomeDaClasse {
    // código aqui
    }

    OBS: o nome da classe deve SEMPRE começar com letra MAIÚSCULA

Toda variável deve começar com letra minúscula e, em caso de nome composto,
utiliza-se o "camelCase".

EX:
int numeroInteiro = 1;

OBS: o termo "final" pode ser acrescentado ao início de uma variável para nunca
mudar o seu valor. Além do "final", o nome da variável deve ser escrito em
letras MAIÚSCULAS.
EX:
int ano = 2021;
ano = 2022;  --> neste caso, é possível mudar o valor da variável "ano" de 2021 para 2022.
final int ANO = 1991 --> não pode mudar o valor da variável "ANO", que é uma constante

Nomes de variáveis devem ser únicos, iniciar com letra minúscula e
conter APENAS letras, _, $ e/ou números.
NÃO devem começar com números nem ter espaços ou palavras reservadas.

    * */

    public static void main(String[] args) { //main é o método de entrada do código

        System.out.println("Olá, mundo!");  // "imprime" ou mostra o conteúdo entre parênteses na tela/output

        //TIPOS PRIMITIVOS EM JAVA: tipos de variáveis (dados básicos) com valores simples

        //INTEIROS: Representam números inteiros. Incluem Byte, Int, Short e Long
        byte numeroBte = (byte)1;
        System.out.println("O número em Byte é: " + numeroBte);

        short numeroCurto = (short)2;
        System.out.println("O número Short é: " + numeroCurto);

        int numeroInteiro = 9;
        System.out.println("O número inteiro é: " + numeroInteiro);

        long numeroLongo = 123456789L; //bota o "L" ou "l" no final pra não dar bug
        System.out.println("O número longo é: " + numeroLongo);

        //PONTOS FLUTUANTES: Tipos para decimais. Incluem Double e Float.

        float numeroFlutua = 1.25f; //bota o "f" ou "F" no final pra não dar bug
        System.out.println("O número Float é: " + numeroFlutua);

        double numeroDecimal = 1.2536498d; //bota o "d" ou "D" no final pra não dar bug

        //CARACTERES: Usa-se o Char.

        char exemploNumero = 194; //mostra o caractere referente à posição 194
        char exemploLetraSimbolo = 'a'; //neste caso, vem entre aspas simples ' '
        System.out.println("Exemplos de caracteres: " + exemploNumero + "e " + exemploLetraSimbolo);

        //BOOLEANO: são variáveis que admitem apenas TRUE ou FALSE como valores.

        boolean exemploVouF = true;
        System.out.println("A Terra é redonda: " + exemploVouF);

        //OBS: String NÃO É um Tipo Primitivo, mas um OBJETO em Java.
        String meuNome = "Cintia";
        System.out.println("Meu nome é " + meuNome);

//VARIÁVEL: espaço onde se pode guardar alguma informação/valor.
        int idade = 33; //tipo da variável --> nome --> = --> valor atribuído
        long cpf; //variável sem valor atribuído ainda
        cpf = 85390836553L; //valor atribuído à variável denominada "CPF". Não precisa repetir o tipo de dado aqui.

        //NÃO É possível mudar o tipo da variável em Java. Mas você pode fazer Casting pra resgatar o valor em outra variável

        //CASTING: extrair o valor de uma variável transformando-o no valor de uma variável de outro tipo.

        //de int pra float:
        int numeroDez = 10;
        System.out.println("O número era: " + numeroDez);
        float intprafloat  = (float) numeroDez;
        System.out.println("Agora é: " + intprafloat);

        //de int pra double:
        int numeroQuinze = 15;
        System.out.println("O número era: " + numeroQuinze);
        double intpradouble = (double) numeroQuinze;
        System.out.println("Agora é: " + intpradouble);

        //de float pra int:
        float quinzeMeio = 15.5f;
        System.out.println("O número era: " + quinzeMeio);
        int floatpraint = (int) quinzeMeio;
        System.out.println("Agora é: " + floatpraint);

        //de String pra int:
        String Vinte = "20";
        System.out.println("O número era: " + Vinte);
        int stringpraint = Integer.parseInt(Vinte);
        System.out.println("Agora é: " + stringpraint);

        //de String pra float:
        String Trinta = "30.5";
        System.out.println("O número era: " + Trinta);
        float stringprafloat = Float.parseFloat(Trinta);
        System.out.println("Agora é: " + stringprafloat);

        //de String pra double:
        String Quarenta = "40.54";
        System.out.println("O número era: " + Quarenta);
        double stringpradouble = Double.parseDouble(Quarenta);
        System.out.println("Agora é: " + stringpradouble);

        //de int pra String:
        int sete = 7;
        System.out.println("O número era: " + sete);
        String intprastring = String.valueOf(sete);
        System.out.println("Agora é: " + intprastring);

        //de float pra String:
        float oito = 8.6f;
        System.out.println("O número era: " + oito);
        String floatprastring = String.valueOf(oito);
        System.out.println("Agora é: " + floatprastring);

        //de double pra String:
        double novepontodez = 9.10;
        System.out.println("O número era: " + novepontodez);
        String doubleprastring = String.valueOf(novepontodez);
        System.out.println("Agora é: " + doubleprastring);

    }
}

/*
JAVA é COMPILADA e INTERPRETADA

Compilar = traduzir a linguagem de programação para a linguagem de máquina.

Interpretar: a JVM (Java Virtual Machine) "lerá" a linguagem compilada para que
o computador entenda as instruções.


ATALHOS PARA O INTELLIJ

psvm + enter --> insere o public static void main automaticamente

sout + enter --> insere o System.out.println( ) automaticamente

OBS: INDENTAÇÃO --> indentar é o mesmo que dar espaço ou tabular o conteúdo do código,
de forma a torná-lo mais organizado e fácil de ler.

**/



