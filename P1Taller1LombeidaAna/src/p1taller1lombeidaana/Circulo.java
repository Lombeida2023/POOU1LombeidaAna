/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1taller1lombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para obtener el radio del círculo
    public double getRadio() {
        return radio;
    }

    // Método para calcular el área del círculo (sobrescribe el método de la clase base)
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}