/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio10Herencia;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Frigorifico fr = new Frigorifico(2, "mabe", 4);
        
        fr.intem();
        System.out.println(fr.toString());
        fr.muestra();
        
        
    }
    
}
