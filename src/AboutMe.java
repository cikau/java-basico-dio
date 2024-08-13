public class AboutMe {

    //testando os argumentos desta classe fora da IDE

    public static void main(String[ ] args) {

        String nome = args[0]; // sempre começa em zero o índice do array
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá! Meu nome é " + nome + " " + sobrenome + " .");
        System.out.println("Eu tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}
