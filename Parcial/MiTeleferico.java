import java.util.ArrayList;

public class MiTeleferico {
    ArrayList<Linea> lineas;
    float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new ArrayList<>();
        this.cantidadIngresos = 0;

        this.lineas.add(new Linea("Rojo"));
        this.lineas.add(new Linea("Amarillo"));
        this.lineas.add(new Linea("Verde"));
    }

    public void agregarPersonaFila(Persona p, String colorLinea) {
        Linea l = buscarLinea(colorLinea);
        if (l != null) {
            l.agregarPersona(p);
        } else {
            System.out.println("Error: No se encontró la línea " + colorLinea);
        }
    }

    public void agregarCabina(String colorLinea) {
        Linea l = buscarLinea(colorLinea);
        if (l != null) {
            int nuevoNroCabina = l.getCabinas().size() + 1;
            l.agregarCabina(nuevoNroCabina);
            System.out.println("Cabina Nro " + nuevoNroCabina + " agregada a Línea " + colorLinea);
        } else {
            System.out.println("Error: No se encontró la línea " + colorLinea);
        }
    }

    public void agregarPrimeraPersonaACabina(String colorLinea, int nroCabina) {
        Linea l = buscarLinea(colorLinea);
        if (l == null) {
            System.out.println("Error (a): Línea " + colorLinea + " no encontrada.");
            return;
        }

        if (l.getFilaPersonas().isEmpty()) {
            System.out.println("Error (a): Fila de Línea " + colorLinea + " está vacía.");
            return;
        }

        Cabina c = l.buscarCabina(nroCabina);
        if (c == null) {
            System.out.println("Error (a): Cabina " + nroCabina + " no existe en Línea " + colorLinea);
            return;
        }

        Persona personaAAbordar = l.getFilaPersonas().get(0);

        boolean exito = c.agregarPersona(personaAAbordar);

        if (exito) {
            System.out.println("Éxito (a): " + personaAAbordar.getNombre() + " abordó Cabina " + nroCabina + " (Línea " + colorLinea + ")");
            l.getFilaPersonas().remove(0);
        } else {
            System.out.println("Fallo (a): " + personaAAbordar.getNombre() + " NO pudo abordar Cabina " + nroCabina);
        }
    }

    public boolean verificarReglasAbordo() {
        System.out.println("\n--- Iniciando Verificación (b) ---");
        boolean todoEnRegla = true;
        for (Linea l : lineas) {
            for (Cabina c : l.getCabinas()) {
                int personas = c.getCantidadPersonas();
                float peso = c.getPesoActual();

                if (personas > Cabina.MAX_PERSONAS) {
                    System.out.println("VIOLACIÓN: Línea " + l.getColor() + ", Cabina " + c.getNroCab() + " excede personas (" + personas + ")");
                    todoEnRegla = false;
                }
                if (peso > Cabina.MAX_PESO) {
                    System.out.println("VIOLACIÓN: Línea " + l.getColor() + ", Cabina " + c.getNroCab() + " excede peso (" + peso + "kg)");
                    todoEnRegla = false;
                }
            }
        }

        if (todoEnRegla) {
            System.out.println("Verificación Completa: Todas las cabinas cumplen las reglas.");
        }
        return todoEnRegla;
    }

    public void calcularIngresoTotal() {
        float total = 0;
        for (Linea l : lineas) {
            for (Cabina c : l.getCabinas()) {
                for (Persona p : c.getPersonasAbordo()) {
                    total += calcularTarifa(p);
                }
            }
        }
        this.cantidadIngresos = total;
        System.out.println("\n--- Resultado (c) ---");
        System.out.println("El ingreso total de todas las líneas es: " + this.cantidadIngresos + " Bs.");
    }

    public void mostrarLineaConMasIngresoRegular() {
        String lineaGanadora = "Ninguna";
        float maxIngresoRegular = -1.0f;

        for (Linea l : lineas) {
            float ingresoRegularLinea = 0;
            for (Cabina c : l.getCabinas()) {
                for (Persona p : c.getPersonasAbordo()) {
                    if (p.getEdad() >= 25 && p.getEdad() <= 60) {
                        ingresoRegularLinea += 3.0f;
                    }
                }
            }
            
            if (ingresoRegularLinea > maxIngresoRegular) {
                maxIngresoRegular = ingresoRegularLinea;
                lineaGanadora = l.getColor();
            }
        }
        
        System.out.println("\n--- Resultado (d) ---");
        if (maxIngresoRegular > 0) {
            System.out.println("La línea con más ingreso REGULAR es: " + lineaGanadora + " (" + maxIngresoRegular + " Bs.)");
        } else {
            System.out.println("No se registraron ingresos con tarifa regular en ninguna línea.");
        }
    }

    private float calcularTarifa(Persona p) {
        int edad = p.getEdad();
        if (edad < 25 || edad > 60) {
            return 1.60f;
        } else {
            return 3.00f;
        }
    }

    public Linea buscarLinea(String color) {
        for (Linea l : lineas) {
            if (l.getColor().equalsIgnoreCase(color)) {
                return l;
            }
        }
        return null;
    }
}