package practica.pkg2;

public class Main2 {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, -1, 2);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("a + b = " + a.add(b));
        System.out.println("2 * a = " + a.scalarMult(2));
        System.out.println("|a| = " + a.length());
        System.out.println("a normalizado = " + a.normalize());
        System.out.println("a · b = " + a.dot(b));
        System.out.println("a × b = " + a.cross(b));
        System.out.println("Proyección de a sobre b = " + a.projection(b));
    }
}