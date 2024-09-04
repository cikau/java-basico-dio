package exercicios;

public class FormatadorCepExemplo {

    public static void main(String[] args) {
        //fazendo o try...catch
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            System.out.println("O CEP não corresponde ao formato correto.");
        }
    }

    //criando um método de formatação de CEP (tem que estar fora do Main)
    static String formatarCep(String cep) throws CepInvalidoExcecao {
        if (cep.length() != 8) { //verifica se o tamanho do CEP é maior ou menor que 8 números
            throw new CepInvalidoExcecao(); //aciona a exceção se o CEP for menor ou maior que 8 números
            //simulando um CEP formatado:

        }
        return "23.765-064"; //tem que estar fora do bloco do if
    }
}
