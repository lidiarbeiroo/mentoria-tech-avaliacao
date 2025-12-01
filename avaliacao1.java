import java.util.Scanner;

public class Avaliacao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =========================
        // EXERCÍCIO 1 – SISTEMA ESCOLAR
        // =========================
        double[] notas = new double[8];

        System.out.println("=== AVALIAÇÃO 1 – EXERCÍCIO DO SISTEMA ESCOLAR ===");
        System.out.println("Digite as 8 notas anuais:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        double semestre1 = (b1 + b2) / 2;
        double semestre2 = (b3 + b4) / 2;

        double mediaFinal = (semestre1 + semestre2) / 2;

        System.out.println("\n=== RESULTADOS DO SISTEMA ESCOLAR ===");
        System.out.println("1º Bimestre: " + b1);
        System.out.println("2º Bimestre: " + b2);
        System.out.println("3º Bimestre: " + b3);
        System.out.println("4º Bimestre: " + b4);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("Média Final: " + mediaFinal);

        // =========================
        // EXERCÍCIO 2 – TEMPERATURA
        // =========================
        System.out.println("\n\n=== AVALIAÇÃO 1 – EXERCÍCIO DA TEMPERATURA ===");
        System.out.print("Digite uma temperatura em °C: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\n=== CONVERSÃO DE TEMPERATURA ===");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        sc.close();
    }
}
