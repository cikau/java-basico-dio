package aulas;

public class Aula4 {
        /*
System.out.print -> método de saída de dados que mostra os dados na tela
sem quebra de linha (continua na mesma linha).

System.out.println -> método de saída de dados que mostra os dados na tela e,
em seguida, quebra a linha (desce para a linha de baixo).

System.out.printf -> método de saída de dados que permite formatar os dados.
%f -> mostra valores reais (float ou double).
%d -> mostra valores inteiros (int, short, long ou byte).
%b -> mostra valores lógicos (boolean).
%c -> mostra um valor caractere (char).
%s -> mostra um valor literal (String).

\n -> este comando, colocado ao início ou final de um texto ou dado, quebra uma linha
para o conteúdo anterior/seguinte.

charAt(  ) -> método que extrai determinado caractere de uma String. Informamos
o índice do caractere a ser selecionado entre parênteses -> Ex: charAt(0) -> seleciona
o primeiro caractere de uma String.

 */
    public static void main(String[] args) {
        int numero1 = 9;
        int numero2 = 10;

        //DEMONSTRAÇÃO DO PRINT - SEM QUEBRA DE LINHA

        System.out.print(numero1);
        System.out.print(numero2);

        //DEMONSTRAÇÃO DO PRINTLN - COM QUEBRA DE LINHA
        System.out.println(); //mesmo sem nada entre parênteses, dá uma quebra de linha
        System.out.println(numero1);
        System.out.println(numero2);

        //DEMONSTRAÇÃO DO PRINTF - COM FORMATAÇÃO
        System.out.printf("%d é menor que %d", numero1, numero2);

        //DEMONSTRAÇÃO DA QUEBRA DE LINHA COM \N
        System.out.println("\nSeja \nbem-vindo!");

        //DEMONSTRAÇÃO DO CHARAT
        String mensagem = "Olá, mundo!"; //espaços entre palavras e letras contam também como caracteres!
        char caractere = mensagem.charAt(0); //contagem do índice começa SEMPRE em 0
        System.out.println(caractere);

    }
}

