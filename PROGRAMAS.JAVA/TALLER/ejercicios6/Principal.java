/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
    
    public static void main(String[] args) {
        Cafetera datos = new Cafetera();
        Scanner in = new Scanner(System.in);

        System.out.println("Hola Bienvenido");
        
        datos.llenarCafetera();
        datos.servirTaza();
        datos.agregarCafe();
    }

} 
   

