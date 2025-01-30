package exercicios;

import java.util.Scanner;

public class CreditoEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEste programa calcula o crédito especial do usuário a partir de seu saldo.");

        //saldo médio = saldoMedio
        //crédito especial = valorCredito
        double saldoMedio, valorCredito;
        valorCredito = 0; //valor inicial

        System.out.println("Digite o seu saldo médio no ano anterior: ");
        saldoMedio = scanner.nextDouble();

        if (saldoMedio > 1000) {
           valorCredito = saldoMedio * 0.30;
        }  else if (saldoMedio > 800) {
            valorCredito = saldoMedio * 0.25;
        } else if (saldoMedio > 600) {
            valorCredito = saldoMedio * 0.20;
        } else {
            valorCredito = saldoMedio * 0.10;
        }

        System.out.printf("\nSALDO MÉDIO = R$ %.2f\n", saldoMedio);
        System.out.printf("\nVALOR DO CRÉDITO = R$ %.2f\n", valorCredito);

    }
}
