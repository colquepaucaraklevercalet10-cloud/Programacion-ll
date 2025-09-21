package practica.pkg3;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: Debes ingresar un número PAR entre 0 y 10.");
            return false;
        }
    }
}