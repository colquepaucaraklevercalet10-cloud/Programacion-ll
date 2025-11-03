package laboratorio5;
public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombia");
        Libro l1 = new Libro("Cien Años de Soledad", "ISBN123", a1);
        l1.agregarPagina(1, "Muchos años después, frente al pelotón de fusilamiento...");
        l1.agregarPagina(2, "El coronel Aureliano Buendía recordaría aquella tarde remota...");

        Estudiante e1 = new Estudiante("E001", "María Pérez");

        Biblioteca b1 = new Biblioteca("Biblioteca Central", "Lunes a Viernes", "8:00", "18:00");
        b1.agregarAutor(a1);
        b1.agregarLibro(l1);
        b1.prestarLibro(e1, l1, "03/11/2025", "10/11/2025");

        b1.mostrarEstado();
        System.out.println("\nLectura del libro:");
        l1.leer();

        System.out.println();
        b1.cerrarBiblioteca();
    }
}