package practica.pkg3;
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo récord: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
            return true;
        } else {
            System.out.println("No te quedan más vidas.");
            return false;
        }
    }
}