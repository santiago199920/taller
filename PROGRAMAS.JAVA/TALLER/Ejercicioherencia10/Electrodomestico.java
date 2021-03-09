/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package Ejercicio10Herencia;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Electrodomesticos {

    private double consumo;
    private String modelo;

    public Electrodomestico(double s, String l) {
        consumo = s;
        modelo = l;
    }

    public String toString() {
        return "Modelo: " + modelo + " Consumo: " + consumo;
    }
}



