/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio5Herencia;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Triangulo extends Figura{
    
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area(){
        area=base*altura/2;
        return area;
    }
    
}
