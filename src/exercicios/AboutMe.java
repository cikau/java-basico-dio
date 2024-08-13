package exercicios;

public class AboutMe {
    //testando os argumentos no Main
    
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
Quando executarmos o código acima no prompt de comando do Windows, poderemos
inserir as informações - seguindo a ordem do código - para aparecer lá. Primeiro,
nome, depois sobrenome, idade e, por último, a altura.

*/
}
