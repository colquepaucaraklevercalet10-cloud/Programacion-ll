package practica.pkg3;
public class Aplicacion {
    public static void main(String[] args) {

        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        System.out.println("\n--- Juego Adivina Numero ---");
        juegoNormal.juega();

        System.out.println("\n--- Juego de Números Pares ---");
        juegoPar.juega();

        System.out.println("\n--- Juego de Números Impares ---");
        juegoImpar.juega();
    }
}
