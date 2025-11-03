package laboratorio5;
public class Prestamo {
    private Estudiante estudiante;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarInfo() {
        System.out.println("Préstamo: " + libro.getTitulo() + " a " + estudiante.getNombre() 
                + " desde " + fechaPrestamo + " hasta " + fechaDevolucion);
    }
}