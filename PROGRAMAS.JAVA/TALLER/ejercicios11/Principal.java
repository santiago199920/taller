/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cancion cancion = new Cancion11();
        
        cancion.dameTitulo();
        cancion.dameAutor();
        cancion.ponTitulo();
        cancion.ponAutor();
    }
    
}
