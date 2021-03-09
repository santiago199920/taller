/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio2herencia;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bombilla bombilla = new Bombilla();
        AlarmaLuminosa alarma = new AlarmaLuminosa();
        
        System.out.println("Para activar la alarma debe sobrepasar el valor privado de 10\n");
        
        alarma.valorPreestablecido();
        alarma.comprobar();
    }
    
}
