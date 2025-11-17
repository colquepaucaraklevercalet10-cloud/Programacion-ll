import java.util.ArrayList;

public class Linea {
    String color;
    ArrayList<Persona> filaPersonas;
    ArrayList<Cabina> cabinas;
    int CantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.CantidadCabinas = 0;
    }

    public void agregarPersona(Persona p) {
        this.filaPersonas.add(p);
    }

    public void agregarCabina(int nroCab) {
        Cabina nuevaCabina = new Cabina(nroCab);
        this.cabinas.add(nuevaCabina);
        this.CantidadCabinas = this.cabinas.size();
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }

    public ArrayList<Persona> getFilaPersonas() {
        return filaPersonas;
    }

    public Cabina buscarCabina(int nroCabina) {
        for (Cabina c : cabinas) {
            if (c.getNroCab() == nroCabina) {
                return c;
            }
        }
        return null;
    }
}