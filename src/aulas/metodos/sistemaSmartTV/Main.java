package aulas.metodos.sistemaSmartTV;

public class Main {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); //criar ou instanciar novo objeto

        System.out.println("A TV está ligada? " + smartTv.ligada); //chama atributo e os seus valores padrão
        System.out.println("A TV está em que canal? " +smartTv.canal);
        System.out.println("A TV está em que volume? " +smartTv.volume);

        smartTv.ligar(); //serve para acionar o método de ligar a TV
        System.out.println("A TV está ligada? " + smartTv.ligada); //atualiza o status da TV

        smartTv.desligar(); //serve para acionar o método de desligar a TV
        System.out.println("A TV está ligada? " + smartTv.ligada); //atualiza o status da TV

        //volume inicial: 10
    smartTv.diminuirVolume(); // 10 - 1 = 9
    smartTv.diminuirVolume(); // 9 - 1 = 8
    smartTv.diminuirVolume(); // 8 - 1 = 7
    smartTv.aumentarVolume(); // 7 + 1 = 8
    System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(13); //inserção de novo valor, entre parênteses, para o canal
        System.out.println("Novo canal: " + smartTv.canal);

    }
}
