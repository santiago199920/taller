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
public class marte {
    
      protected String nombre;
    protected double masa_del_cuerpo;
    protected double diametro_medio;
    protected double periodo_de_rotacion_eje;
    protected double periodo_traslacion;
    protected double distancia_cuerpo;
    protected double excentricidad;

    //constructor 

    public marte(String nombre, double masa_cuerpo, double diametro_medio, double periodo_rotacion_eje, double periodo_traslacion, double distancia_cuerpo, double excentricidad) {
        this.nombre = nombre;
        this.masa_del_cuerpo = masa_cuerpo;
        this.diametro_medio = diametro_medio;
        this.periodo_de_rotacion_eje = periodo_rotacion_eje;
        this.periodo_traslacion = periodo_traslacion;
        this.distancia_cuerpo = distancia_cuerpo;
        this.excentricidad = excentricidad;
    }
    //metodo
    public void Mostrar(){
        System.out.println("nombre: "+nombre
                            +"\nmasa del cuerpo: "+masa_del_cuerpo
                            +"\ndiametro medio: "+diametro_medio
                            +"\nel periodo de rotacion sobre el propio eje: "+periodo_de_rotacion_eje
                            +"\nperiodo de traslacion alrededor del cuerpo que orbita: "+periodo_traslacion
                            +"\ndistancia media a ese cuerpo: "+distancia_cuerpo
                            +"\nexcentricidad de la órbita: "+excentricidad);


    }

    
}
