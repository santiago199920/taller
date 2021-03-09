/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio8Herencia;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {

    public static void main(String[] args) {

        //crear objetos
        marte marte = new marte("marte",15,51,37,53,31,12);
        planeta planeta1 = new planeta("Saturno",23,32,32,41,44,42);
        satelite satelite1 = new satelite("tierra",23,33,23,31,21,53);
        //para mostrar
        System.out.println("\n");
        marte.Mostrar();
        System.out.println("\n");
        planeta1.Mostrar();
        System.out.println("\n");
        satelite1.Mostrar();
        System.out.println("\n");
    }




}
    

