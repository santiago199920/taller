/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio5Herencia;

import java.util.ArrayList;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Jerarquia {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(10));
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10, 5)); // Base=10, Altura=5;
        for (Figura f : figuras)
            System.out.println("Área: " + f.area());
    }
    
}
