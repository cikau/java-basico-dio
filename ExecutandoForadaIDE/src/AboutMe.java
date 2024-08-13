public class AboutMe {

//testando os argumentos no Main fora da IDE

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome + " .");
        System.out.println("Tenho " + idade + " anos e " + altura + " de altura.");

    }
}
/*
Para executar o código no Prompt de Comando do Windows, vá na pasta "out", e depois em
"ExecutandoForadaIDE", em que você deve clicar com o botão direito do mouse
 e escolher a opção "copy path/reference". Copie o path do projeto:
C:\Users\Cintia\Documents\LEITURA E ESTUDOS\PROGRAMAÇÃO\MeusRepositorios\JAVA\ExecutandoForadaIDE\out\production\ExecutandoForadaIDE

Digite "cmd" em pesquisar, sem as aspas, para entrar no prompt de comando do Windows. Lá no prompt, digite "cd" e dê um espaço simples
para colocar o endereço do projeto.
Clique em ENTER e você entrará na pasta.
Para executar a classe, basta digitar: java AboutMe. Aperte ENTER em seguida.

 */
