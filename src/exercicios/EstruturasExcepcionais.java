package exercicios;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasExcepcionais {
 public static void main(String[] args) {
     //estrutura try-catch:
    try {   //abrange o código a partir daqui
     //criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("Digite o seu nome: ");
     String nome = scanner.next();

     System.out.println("Digite o seu sobrenome: ");
     String sobrenome = scanner.next();

     System.out.println("Digite a sua idade: ");
     int idade = scanner.nextInt();

     System.out.println("Digite a sua altura: ");
    double altura = scanner.nextDouble();

    //imprimindo os dados inseridos pelo usuário:
     System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
     System.out.println("Tenho " + idade + " anos.");
     System.out.println("Minha altura é " + altura + " cm.");
     scanner.close();
    } //fim do try neste ponto
    catch(InputMismatchException e ) { //importamos a classe da exceção definida
        System.err.println("Os campos 'idade' e 'altura' precisam ser numéricos."); //colocamos um código para lidar com a exceção em questão
    } //o "err" no lugar do "out" em System dá a entender que é um aviso de erro no programa
  }

}

/*
POSSÍVEIS EXCEÇÕES DO PROGRAMA ACIMA:

- Não informar nome ou o sobrenome;
- O valor da idade ter um caractere não numérico;
- O valor da altura ter uma vírgula, em vez de um ponto (conforme padrão americano).

SOLUÇÕES/TRATAMENTO PARA AS EXCEÇÕES:
- Mensagem de erro
- Solicitar inserção correta de dados

 */