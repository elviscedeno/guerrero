/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TALLER;

/**
 *
 * @author elvis
 */
public class Rectangulo {
    
    double ancho;
    double altura;

    public Rectangulo() {
        this.ancho = 1.00d;
        this.altura = 1.00d;
    }

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
    public double getPerimetro(){
        return (ancho + altura) * 2;
    }
    
    public static void main(String [] args){
        Rectangulo recta = new Rectangulo();
        recta.getArea();
        recta.getPerimetro();
    }
}
