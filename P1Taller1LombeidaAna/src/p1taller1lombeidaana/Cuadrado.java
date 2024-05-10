/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1taller1lombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
class Cuadrado extends FiguraGeometrica {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
     // Método para obtener el lado del cuadrado
    public double getLado() {
        return lado;
    }

    // Método para calcular el área del cuadrado (sobrescribe el método de la clase base)
    @Override
    public double calcularArea() {
        return lado * lado;
    }}


