package org.example;

public abstract class Vehiculo {
    protected String matricula;
    protected String color;
    protected String marca;
    protected Pieza[] piezas;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.piezas = new Pieza[5]; // Suponemos que todos los vehículos tienen 5 piezas
    }

    public abstract void reparar();

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

