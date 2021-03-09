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
public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area(){
         area= Math.pow (lado, 2);          
        return area;
    }
    
}
