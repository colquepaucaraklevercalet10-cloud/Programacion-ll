package practica.pkg3;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
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

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }

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