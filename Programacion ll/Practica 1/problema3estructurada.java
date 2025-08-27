package estadistica;
import java.util.Scanner;

public class ProgramacionEstructurada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números separados por espacio:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        double promedio = calcularPromedio(numeros);
        double desviacion = calcularDesviacion(numeros, promedio);

        System.out.printf("El promedio es %.2f\n", promedio);
        System.out.printf("La desviación estándar es %.5f\n", desviacion);

    }

    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularDesviacion(double[] numeros, double promedio) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}
