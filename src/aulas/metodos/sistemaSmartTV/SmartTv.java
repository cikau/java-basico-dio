package aulas.metodos.sistemaSmartTV;

public class SmartTv {

    //atributos da classe SmartTV
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    //métodos da classe SmartTV
    public void ligar() {  //método que muda o valor do boolean ligada para "true"
        ligada = true;
    }

    public void desligar() {  //método que muda o valor do boolean ligada para "false"
        ligada = false;
    }

public void aumentarVolume() {
        volume++;
    System.out.println("Aumentando o volume para: " + volume);
}

public void diminuirVolume() {
        volume--;
    System.out.println("Reduzindo o volume para: " + volume);
}

public void aumentarCanal() {
        canal++;
}

public void diminuirCanal() {
        canal--;
}

public void mudarCanal(int novoCanal) {
        canal = novoCanal;
}

}
