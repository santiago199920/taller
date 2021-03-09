/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio13;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
    
    public static void main(String[] args){
        
        CD ob1 = new CD();
        
        System.out.println("El total de canciones es de "+ob1.tamaño_maximo);
        
        Cancion c1 = new Cancion("El ultimo adios", 4, "Cristian Perdomo");
        
        c1.mostrar();
    } 
    
}
