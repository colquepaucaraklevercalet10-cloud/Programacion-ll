package laboratorio5;
import java.util.*;
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;
    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    public void prestarLibro(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        Prestamo p = new Prestamo(estudiante, libro, fechaPrestamo, fechaDevolucion);
        prestamos.add(p);
    }
    public void mostrarEstado() {
        System.out.println("Biblioteca: " + nombre);
        horario.mostrarHorario();
        System.out.println("Autores registrados:");
        for (Autor a : autores) a.mostrarInfo();
        System.out.println("Libros disponibles:");
        for (Libro l : libros) System.out.println(l);
        System.out.println("Préstamos activos:");
        for (Prestamo p : prestamos) p.mostrarInfo();
    }
    public void cerrarBiblioteca() {
        prestamos.clear();
        System.out.println("La biblioteca ha cerrado. Todos los préstamos han finalizado.");
    }
    public class Horario {
        private String dias;
        private String horaApertura;
        private String horaCierre;
        public Horario(String dias, String horaApertura, String horaCierre) {
            this.dias = dias;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }
        public void mostrarHorario() {
            System.out.println("Horario: " + dias + " de " + horaApertura + " a " + horaCierre);
        }
    }
}