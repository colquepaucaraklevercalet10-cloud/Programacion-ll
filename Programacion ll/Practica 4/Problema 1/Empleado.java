package practica.pkg4;
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalarioMensual();

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
