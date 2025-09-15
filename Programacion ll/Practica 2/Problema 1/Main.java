package practica.pkg2;

public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(2, 4, 6);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("¿Son perpendiculares? " + AlgebraVectorial.perpendicular(a, b));
        System.out.println("¿Son paralelos? " + AlgebraVectorial.paralela(a, b));
        System.out.println("Proyección de a sobre b: " + AlgebraVectorial.proyeccion(a, b));
        System.out.println("Componente de a en b: " + AlgebraVectorial.componente(a, b));
    }
}