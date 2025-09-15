package practica.pkg2;

public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D scalarMult(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double len = length();
        if (len == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(x / len, y / len, z / len);
    }

    public double dot(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector3D cross(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    public Vector3D projection(Vector3D b) {
        double escalar = this.dot(b) / b.dot(b);
        return b.scalarMult(escalar);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}