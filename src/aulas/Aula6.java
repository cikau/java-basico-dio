package aulas;

public class Aula6 {

    /*
    TERMINAL E ARGUMENTOS EM JAVA

 MAIN ARGS: quando executamos uma classe que contenha o método MAIN,
 ele permite que passemos um Array [ ] de argumentos String. Logo, é possível
 esses parâmetros após definir a classe a ser executada.
 EX:
 public class AboutMe {
 public static void main(String[ ] args) {
 String nome = args [0]; --> o número inicial do índice começa SEMPRE em ZERO
 String sobrenome = args [1];
 int idade = Integer.valueOf(args[2]);
 double altura = Double.valueOf(args[3]);
    }
 }

SCANNER: esta classe permite que o usuário tenha uma interação mais assertiva
com o programa. Ela captura tudo o que o usuário digita, ou seja, as informações que ele
insere.
Usamos assim:

import java.util.Scanner; //aqui a gente informa ao Java que vai usar o Scanner

public class NomeClasse {

public static void main(String[ ] args) {
    //criando o objeto Scanner:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o seu nome: ");
    String nome = scanner.next( );

    System.out.println("Digite seu sobrenome completo: ");
    String sobrenome = scanner.nextLine( );

    System.out.println("Digite a sua idade: ");
    int idade = scanner.nextInt( );

    System.out.println("Digite a sua altura: ");
    double altura = scanner.nextDouble( );

    //imprimindo os dados inseridos pelo usuário:
    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos.");
    System.out.println("A minha altura é :" + altura);

scanner.close(); //devemos fechar a classe para evitar vazamentos de recursos
    }
}
    */
}


