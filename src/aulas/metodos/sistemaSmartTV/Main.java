package aulas.metodos.sistemaSmartTV;

public class Main {

    public static void main(String[] args) throws Exception {

        SmartTv televisaoLG = new SmartTv(); //criar ou instanciar novo objeto

        System.out.println("A TV está ligada? " + televisaoLG.ligada); //chama atributo e os seus valores padrão
        System.out.println("A TV está em que canal? " + televisaoLG.canal);
        System.out.println("A TV está em que volume? " + televisaoLG.volume);

        televisaoLG.ligar(); //serve para acionar o método de ligar a TV
        System.out.println("A TV está ligada? " + televisaoLG.ligada); //atualiza o status da TV

        televisaoLG.desligar(); //serve para acionar o método de desligar a TV
        System.out.println("A TV está ligada? " + televisaoLG.ligada); //atualiza o status da TV

        //volume inicial: 10
        televisaoLG.diminuirVolume(); // 10 - 1 = 9
        televisaoLG.diminuirVolume(); // 9 - 1 = 8
        televisaoLG.diminuirVolume(); // 8 - 1 = 7
        televisaoLG.aumentarVolume(); // 7 + 1 = 8
            System.out.println("Volume atual: " + televisaoLG.volume);

        System.out.println("Canal atual: " + televisaoLG.canal);
        televisaoLG.mudarCanal(13); //inserção de novo valor, entre parênteses, para o canal
        System.out.println("Novo canal: " + televisaoLG.canal);

    }
}
