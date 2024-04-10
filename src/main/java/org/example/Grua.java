package org.example;

public class Grua extends Vehiculo {
    public Grua(String matricula, String color, String marca) {
        super(matricula, color, marca);
        for (int i = 0; i < piezas.length; i++) {
            this.piezas[i] = new Pieza("Pieza de Grua " + (i + 1));
        }
    }

    @Override
    public void reparar() {
        for (Pieza pieza : piezas) {
            System.out.println("Reparando " + pieza.getNombre() + " de la grúa " + matricula);
        }
    }
}

