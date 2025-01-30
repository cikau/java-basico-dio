package exercicios;

import java.util.Scanner;

public class CalcSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEste programa calcula e mostra o salário a receber do funcionário.\n");
        //número de horas trabalhadas = numHorasTrab
        //quantidade de horas extra trabalhadas = numHorasExtrasTrab
        //dependentes = numDep

        int numHorasTrab, numHorasExtrasTrab, numDep;

        //salário do mês = salMes
        //acréscimo por Dependente = acrescimoDep
        // Valor das horas extra = valorHoraExtra
        // Salário bruto = salBruto
        // Imposto de Renda = irrf
        // Valor da hora trabalhada = valorHoraTrab
        //salário a receber = salReceber

        double salMes, acrescimoDep, valorHoraExtra, salBruto, irrf, valorHoraTrab, salReceber;

        System.out.println("Por favor, informe o VALOR DA HORA TRABALHADA: ");
        valorHoraTrab = scanner.nextDouble();

        System.out.println("Agora, informe o NÚMERO DE HORAS TRABALHADAS: ");
        numHorasTrab = scanner.nextInt();

        System.out.println("Digite o NÚMERO DE DEPENDENTES: ");
        numDep = scanner.nextInt();

        System.out.println("Informe o NÚMERO DE HORAS EXTRA TRABALHADAS: ");
        numHorasExtrasTrab = scanner.nextInt();

    //salário do mês = número de horas trabalhadas * valor da hora trabalhada
        salMes = numHorasTrab * valorHoraTrab;
        // Para cada dependente, + 132 reais
        acrescimoDep = numDep * 132;
    // Valor das horas extras = valor das horas trabalhadas  + valor das horas trabalhadas * 50%
        valorHoraExtra =  valorHoraTrab + valorHoraTrab * 50/100;
    // salário bruto = salário do mês + acréscimo por dependente + valor das horas extras
        salBruto = salMes + acrescimoDep + valorHoraExtra;

    // irrf -> salário bruto < 1000 = 0; salário bruto > 100 && salário bruto < 5000 = 10/100; salário bruto >= 5000 = 20/100
        if (salBruto == 1000) {
            irrf = 0;
        } else if (salBruto >= 1000 && salBruto <= 5000) {
          irrf = salBruto * 0.10; // 0,10 = 10%
        } else {
            irrf = salBruto * 0.20; // 0,20 = 20%
        }

        // salário a receber = salário bruto - irrf
        salReceber = salBruto - irrf;
        System.out.printf("Seu SALÁRIO A RECEBER é de: R$ %.2f\n", salReceber);

        scanner.close();
    }
}
