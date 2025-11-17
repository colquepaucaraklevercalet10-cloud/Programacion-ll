import java.util.ArrayList;

public class Cabina {
    int nroCab;
    ArrayList<Persona> personasAbordo;

    public static final int MAX_PERSONAS = 10;
    public static final float MAX_PESO = 850.0f;

    public Cabina(int nroCabina) {
        this.nroCab = nroCabina;
        this.personasAbordo = new ArrayList<>();
    }

    public boolean agregarPersona(Persona p) {
        if (p == null) {
            return false;
        }

        if (getCantidadPersonas() >= MAX_PERSONAS) {
            System.out.println("Error Cabina " + nroCab + ": Límite de personas (" + MAX_PERSONAS + ") alcanzado.");
            return false;
        }

        if (getPesoActual() + p.getPesoPersona() > MAX_PESO) {
            System.out.println("Error Cabina " + nroCab + ": Límite de peso (" + MAX_PESO + "kg) sería excedido.");
            return false;
        }

        this.personasAbordo.add(p);
        return true;
    }

    public int getNroCab() {
        return nroCab;
    }

    public ArrayList<Persona> getPersonasAbordo() {
        return personasAbordo;
    }

    public float getPesoActual() {
        float pesoTotal = 0;
        for (Persona p : personasAbordo) {
            pesoTotal += p.getPesoPersona();
        }
        return pesoTotal;
    }

    public int getCantidadPersonas() {
        return personasAbordo.size();
    }
}