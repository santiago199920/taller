/*
"Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad máxima
de café que puede contener la cafetera) y _cantidadActual (la cantidad actual de
café que hay en la cafetera). Implementa, al menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• getters, setters".
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Cafetera {

    Scanner in = new Scanner(System.in);

    int capacidadMaxima, capacidadActual;

    public Cafetera() { 
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;     
    }

    public Cafetera(int capacidadMaxima) {

        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;

    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {

        if (capacidadActual > capacidadMaxima) {

            this.capacidadMaxima = capacidadMaxima;
            this.capacidadActual = capacidadMaxima;

        } else {
            this.capacidadMaxima = capacidadMaxima;
            this.capacidadActual = capacidadActual;
        }
    }

    public void llenarCafetera() {

        this.capacidadActual = capacidadMaxima;
        System.out.println("La capacidad maxima es de: " + capacidadMaxima + "cc");
        System.out.println("-----------------");
        System.out.println("Llenando cafetera");
        System.out.println("-----------------");
        System.out.println("La cantidad de cafe actual es de: " + capacidadActual);

    }

    public void servirTaza() {
        System.out.println("Que cantidad de cafe desea servir?");
        int capacidadTaza = in.nextInt();

        capacidadActual -= capacidadTaza;
        if (capacidadActual <= 0) {
            capacidadActual = 0;
            System.out.println("-----------------");
            System.out.println("¡Cafetera vacia!");
            System.out.println("-----------------");
            System.out.println("La cantidad de cafe actual es de: " + capacidadActual);

        } else {
            System.out.println("---------------------");
            System.out.println("Llenando taza...");
            System.out.println("Taza llena!!!");
            System.out.println("La cantidad de cafe actual es de: " + capacidadActual);
            System.out.println("---------------------");
        }
    }

    public void vaciarCafetera() {
        capacidadActual = 0;
        System.out.println("--------------------");
        System.out.println("Vaciando cafetera...");
        System.out.println("--------------------");

    }

    public void agregarCafe() {
        vaciarCafetera();
        System.out.println("Agregue cafe por favor");
        int llenado = in.nextInt();
        capacidadActual += llenado;

        if (capacidadActual > capacidadMaxima) {

            System.out.println("Excede la capaciada maxima");

        } else {
            System.out.println("-----------------");
            System.out.println("Llenando cafetera");
            System.out.println("-----------------");
            System.out.println("La cantidad de cafe actual es de: " + capacidadActual);
        }

    }

}