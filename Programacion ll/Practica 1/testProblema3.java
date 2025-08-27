package estadistica;
import java.util.Scanner;
public class TestEstadistica {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 numeros separados por espacio o linea:");
        for(int i = 0; i<datos.length; i++){
            datos[i] = sc.nextDouble();
        }
        Estadistica p1 = new Estadistica(datos);
        
        System.out.printf("El promedio es %.2f\n", p1.promedio());
        System.out.printf("La desviacion estandar es %.5f\n", p1.desviacion());
    }
}