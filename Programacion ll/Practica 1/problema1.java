package ecuacionlineal;

public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public EcuacionLineal(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean tieneSolucion(){
        return (a * d - b * c) !=0;
    }
    
    public double getX(){
        double det = a * d - b * c;
        return (e * d - b * f) / det;
    }
    public double getY(){
        double det = a * d - b * c;
        return (a * f - e * c) / det;
    }
}