package exercicios;

import java.util.Scanner;

public class DiferencaHorarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEste programa calcula a hora do início e a hora do final de um jogo ou evento.");

        int horaInicio, minInicio, horaFim, minFim;

        System.out.println("Digite a hora do início: ");
        horaInicio = scanner.nextInt();
        System.out.println("Digite os minutos do início: ");
        minInicio = scanner.nextInt();
        System.out.println("Digite a hora do fim: ");
        horaFim = scanner.nextInt();
        System.out.println("Digite os minutos do fim: ");
        minFim = scanner.nextInt();

        //calculando a diferença entre horas e minutos
        int horaDif, minDif;
        horaDif = horaFim - horaInicio;
        minDif = minFim - minInicio;

        if (minDif < 0) {
            minDif = minDif + 60;
            horaDif = horaDif - 1;
        }
        if (horaDif < 0) {
            horaDif = horaDif + 24;
        }
System.out.printf("\nDIFERENÇA = %02d:%02d\n", horaDif, minDif);
    }
}
