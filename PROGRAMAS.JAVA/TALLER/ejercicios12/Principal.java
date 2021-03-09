/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio12;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {
    
    public static void main(String[] args){
        
        Libro librop = new Libro("Introduction to Java Programming 3a. Edicion", "Liang, Y. Daniel", "0-13-031997-X", "Prentice-Hall", "New Jersey, USA", "Viernes 16 de Noviembre de 2001", 784);
        
        System.out.println(librop.toString());
    }
    
}
