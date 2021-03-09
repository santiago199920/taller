/*
"Cree una clase denominada Alarma cuyos objetos activen un objeto de tipo Timbre 
cuando el valor medido por un Sensor supere un umbral preestablecido:
Implemente en Java todo el código necesario para el funcionamiento de la alarma,
suponiendo que la alarma comprueba si debe activar o desactivar el timbre cuando
se invoca el método comprobar"().
 */
package Ejercicio1herencia;

import java.util.Scanner;



/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Alarma {

    private double umbra;
    Sensor sensor = new Sensor();
    Timbre timbre = new Timbre();
    Scanner in = new Scanner(System.in);
    
    public void valorPreestablecido(){
        System.out.println("Digite el valor preestablecido del umbral");
        umbra = in.nextDouble();
    }
    

    public double getUmbra() {
        return umbra;
    }

    public void setUmbral(double umbra) {
        this.umbra = umbra;
    }
    
    public void comprobar (){
        if (sensor.getValorActual() > umbra){
            timbre.desactivar();
        }else{
            timbre.activar();
        }
    }
}
