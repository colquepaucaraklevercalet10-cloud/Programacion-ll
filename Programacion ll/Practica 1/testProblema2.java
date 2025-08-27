package ecuacionlineal2;
import java.util.Scanner;
public class TestEcuacionLineal2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i<3; i++){
            System.out.println("Ingrese a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            EcuacionLineal2 p1 = new EcuacionLineal2(a, b, c);
            double d = p1.getDiscriminante();
            if(d>0){
                System.out.println("La ecuacion tiene dos raices " + p1.getRaiz1()
                + p1.getRaiz2());
            }else if (d==0){
                System.out.println("La ecuacion tiene una raiz " + p1.getRaiz1());
            }else{
                System.out.println("La ecuacion no tiene raices reales");
            }
        }
    }
}