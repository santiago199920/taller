/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio9;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Coche {
    
    int motorr;
    int ruedass;
    int puertass;

    public Coche(int motorr, int ruedass, int puertass) {
        this.motorr = motorr;
        this.ruedass = ruedass;
        this.puertass = puertass;
    }
    
    public Coche(){
        this.motorr=1;
        this.ruedass=4;
        this.puertass=4;
    }
    
    public void encender(){
        System.out.println("Motorr encendido");
    }
    
    public void apagar(){
        System.out.println("Motorr apagado");
    }
    
    public void inflar(){
        System.out.println("Inflando ruedas");
    }
    
    public void desinflar(){
        System.out.println("Desinflando ruedas");
    }
    
    
}
