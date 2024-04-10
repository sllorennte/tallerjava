package org.example;

public class Coche extends Vehiculo {
    public Coche(String matricula, String color, String marca) {
        super(matricula, color, marca);
        // Inicializar las piezas específicas de Coche, como ejemplo
        for (int i = 0; i < piezas.length; i++) {
            this.piezas[i] = new Pieza("Pieza " + (i + 1));
        }
    }

    @Override
    public void reparar() {
        // Reparaciones específicas de Coche
        for (Pieza pieza : piezas) {
            System.out.println("Reparando " + pieza.getNombre() + " del coche " + matricula);
            // Lógica de reparación para cada pieza
        }
    }
}

