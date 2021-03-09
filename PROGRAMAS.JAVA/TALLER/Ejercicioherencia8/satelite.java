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
public class satelite extends marte{
    
    public satelite(String nombre, double masa_cuerpo, double diametro_medio, double periodo_rotacion_eje, double periodo_traslacion, double distancia_cuerpo, double excentricidad) {
        super(nombre, masa_cuerpo, diametro_medio, periodo_rotacion_eje, periodo_traslacion, distancia_cuerpo, excentricidad);
    }
}
