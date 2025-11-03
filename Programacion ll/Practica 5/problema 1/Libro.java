package laboratorio5;
import java.util.*;
public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;
    private Autor autor;

    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }
    public void agregarPagina(int numero, String contenido) {
        paginas.add(new Pagina(numero, contenido));
    }
    public void leer() {
        for (Pagina p : paginas) p.mostrarPagina();
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public String toString() {
        return "Libro: " + titulo + " (ISBN: " + isbn + ") - Autor: " + autor.getNombre();
    }
}