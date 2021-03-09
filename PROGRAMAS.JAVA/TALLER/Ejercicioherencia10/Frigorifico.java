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
public class Frigorifico extends Electrodomestico implements MuestraInformacion {

    double temperatura;
    Scanner in = new Scanner(System.in);

    public Frigorifico(double s, String l, double t) {
        super(s, l);
        this.temperatura = temperatura;
        
    }
    
    public void intem(){
        System.out.println("Ingrese la temperatura");
        temperatura = in.nextInt();
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "temperatura=" + temperatura + '}';
    }
    

    
    
    @Override
    public String muestra() {
        System.out.println("La temperatura del frigorifico es: "+temperatura);
        return null;
    }
}
