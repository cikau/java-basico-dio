package exercicios;

public class Exercicio4 {

    //EXEMPLOS DE MÉTODOS: fora do main, seja acima, seja abaixo do escopo dele

    public static void main(String[] args) {

        int numeroUm = 5;
        int numeroDois = 6;
        int conta = somar(numeroUm, numeroDois); //não precisa colocar de novo o tipo das variáveis aqui
        System.out.println("O resultado é: " + conta);

    }

    public static int somar(int numeroUm, int numeroDois) { //método deve ser static tbm para ser chamado no main
        return numeroUm + numeroDois;
    }
}

/* DECLARAR MÉTODO: deve ser fora do escopo do public static void main. Para chamar o método, tem que ser no main.
    Parâmetros são separados por vírgula.


TipoRetorno nomeObjetivoNoInfinitivo Parametro(s)
Exemplo:
public static String porNomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome + " " + segundoNome;


ALTERNATIVA:
        return primeiroNome.concat(" ").concat(segundoNome);

        .concat(" ") dá um espaço entre o primeiro nome e o segundo nome
*/

