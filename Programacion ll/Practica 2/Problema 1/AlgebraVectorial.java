package practica.pkg2;
class AlgebraVectorial {
    public static boolean perpendicular(Vector a, Vector b) {
        return a.dot(b) == 0;
    }

    public static boolean perpendicular(Vector a, Vector b, boolean metodo2) {
        double normaSuma = new Vector(a.x + b.x, a.y + b.y, a.z + b.z).norma();
        double normaResta = new Vector(a.x - b.x, a.y - b.y, a.z - b.z).norma();
        return Math.abs(normaSuma - normaResta) < 1e-6;
    }

    public static boolean paralela(Vector a, Vector b) {
        Vector c = a.cross(b);
        return (c.x == 0 && c.y == 0 && c.z == 0);
    }

    public static boolean paralela(Vector a, Vector b, boolean metodo2) {
        double r1 = (b.x != 0) ? a.x / b.x : 0;
        double r2 = (b.y != 0) ? a.y / b.y : 0;
        double r3 = (b.z != 0) ? a.z / b.z : 0;
        return (r1 == r2 || r2 == r3 || r1 == r3);
    }

    public static Vector proyeccion(Vector a, Vector b) {
        double escalar = a.dot(b) / Math.pow(b.norma(), 2);
        return new Vector(escalar * b.x, escalar * b.y, escalar * b.z);
    }

    public static double componente(Vector a, Vector b) {
        return a.dot(b) / b.norma();
    }
}

