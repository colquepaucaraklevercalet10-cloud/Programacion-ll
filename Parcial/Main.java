public class Main {
    public static void main(String[] args) {
        
        MiTeleferico teleferico = new MiTeleferico();

        teleferico.agregarCabina("Rojo");
        teleferico.agregarCabina("Rojo");
        teleferico.agregarCabina("Verde");
        teleferico.agregarCabina("Amarillo");

        teleferico.agregarPersonaFila(new Persona("Miguel", 30, 60.0f), "Rojo");
        teleferico.agregarPersonaFila(new Persona("Edgar", 45, 85.0f), "Rojo");
        teleferico.agregarPersonaFila(new Persona("Jhojan", 18, 70.0f), "Rojo");

        teleferico.agregarPersonaFila(new Persona("Diego", 25, 55.0f), "Verde");
        teleferico.agregarPersonaFila(new Persona("Eliana", 65, 62.0f), "Verde");

        teleferico.agregarPersonaFila(new Persona("Franco", 22, 90.0f), "Amarillo");
        
        System.out.println("\n--- Ejecutando (a) Abordajes ---");

        teleferico.agregarPrimeraPersonaACabina("Rojo", 1);
        teleferico.agregarPrimeraPersonaACabina("Rojo", 1);
        teleferico.agregarPrimeraPersonaACabina("Rojo", 2);

        teleferico.agregarPrimeraPersonaACabina("Verde", 1);
        teleferico.agregarPrimeraPersonaACabina("Verde", 1);

        teleferico.agregarPrimeraPersonaACabina("Amarillo", 1);

        teleferico.agregarPrimeraPersonaACabina("Amarillo", 1);
        teleferico.agregarPrimeraPersonaACabina("Verde", 99);
        
        teleferico.verificarReglasAbordo();

        teleferico.calcularIngresoTotal();

        teleferico.mostrarLineaConMasIngresoRegular();
    }
}