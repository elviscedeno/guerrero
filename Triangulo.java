/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_grupal;

/**
 *
 * @author elvis
 */
public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    double altura;
    double ancho;

    public Triangulo() {
        this.lado1 = 1.0d;
        this.lado2 = 1.0d;
        this.lado3 = 1.0d;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public double getArea(){
        return (ancho * altura) / 2;
    }
    
    public double getPerimetro(){
        return lado1 + lado2 + lado3;
    }
}
