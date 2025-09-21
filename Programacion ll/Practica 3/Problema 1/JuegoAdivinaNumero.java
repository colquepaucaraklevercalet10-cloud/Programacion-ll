package practica.pkg3;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        reiniciaPartida(numeroDeVidas); 
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        numeroAAdivinar = random.nextInt(11);

        System.out.println("¡Bienvenido al juego Adivina el Número!");
        System.out.println("Debes adivinar un número entre 0 y 10.");

        boolean seguirJugando = true;

        while (seguirJugando) {
            System.out.print("Introduce tu número: ");
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord(); 
                break; 
            } else {
                seguirJugando = quitaVida();

                if (seguirJugando) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es MAYOR.");
                    } else {
                        System.out.println("El número a adivinar es MENOR.");
                    }
                    System.out.println("Intenta de nuevo...");
                }
            }
        }
    }
}

