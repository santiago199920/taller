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
public class Circulo extends Figura{
    
    
    private final double pi = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double area(){
        
        area = pi * Math.pow(radio, 2);
        return area;
    }
}
