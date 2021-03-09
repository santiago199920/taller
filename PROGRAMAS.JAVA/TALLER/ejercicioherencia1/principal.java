/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio1herencia;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class principal {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sensor sensor = new Sensor();
        Timbre timbre = new Timbre();
        Alarma alarma = new Alarma();
        
        
        System.out.println("Para activar la alarma debe sobrepasar el valor privado de 10\n");
        alarma.valorPreestablecido();
        alarma.comprobar();
        
        
    }
}
