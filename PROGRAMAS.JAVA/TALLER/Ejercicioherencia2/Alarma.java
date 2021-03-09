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
public class Alarma {
    
    private double umbral;
    Sensor sensor = new Sensor();
    Bombilla bombilla = new Bombilla();
    Timbre timbre = new Timbre();
    Scanner in = new Scanner(System.in);
    
    public void valorPreestablecido(){
        System.out.println("Digite el valor preestablecido del umbral");
        umbral = in.nextDouble();
    }
    

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }
    
    public void comprobar (){
        if (sensor.getValorActual() > umbral){
            timbre.desactivar();
            bombilla.apagado();
        }else{
            timbre.activar();
            bombilla.encendido();
        }
    }
    
}
