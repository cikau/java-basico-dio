package exercicios;

public class Exercicio2 {

    /* EXERCÍCIO: Na empresa em que trabalhamos, há tabelas com o gasto
   de cada mês. Para fechar o balanço do primeiro trimestre, precisamos
   somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil, em
   fevereiro, 23 mil, e em março, 17 mil reais, faça um programa que calcule
   e imprima a despesa total no trimestre e a média mensal de gastos.
   */
    public static void main(String[] args) {

        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int somaTotal = janeiro + fevereiro + marco;
        int mediaGastos = somaTotal / 3;
        System.out.println("A despesa total no trimestre foi de: " + somaTotal +
                "\nA média mensal de gastos foi de: " + mediaGastos);

    }
}
