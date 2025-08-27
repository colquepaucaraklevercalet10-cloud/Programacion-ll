package ecuacionlineal2;

public class EcuacionLineal2 {
    private double a;
    private double b;
    private double c;
    
    public EcuacionLineal2 (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante(){
        return (b * b) - (4 * a * c);
    }
    
    public double getRaiz1(){
        double d = getDiscriminante();
        if(d<0){
            return 0;
        }return(-b + Math.sqrt(d))/(2 * a);
    }
    
    public double getRaiz2(){
        double d = getDiscriminante();
        if(d<0){
            return 0;
        }return(-b - Math.sqrt(d))/(2 * a);
    }
}
