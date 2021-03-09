/*
  "Desarrolla una clase CD con los siguientes atributos:
• canciones: un array de objetos de la clase Cancion.
• contador: la siguiente posición libre del array canciones. y los siguientes métodos:
• CD(): constructor predeterminado (creará el array canciones).
• numeroCanciones(): devuelve el valor del contador de canciones.
• dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
• grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
• agrega(Cancion): agrega al final del array la Cancion proporcionada.
• elimina(int): elimina la Cancion que se encuentra en la posición indicada".
 */
package ejercicio13;

import java.util.ArrayList;
/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class CD {
    
    int contador = 0;
    int tamaño_maximo = 7;
    ArrayList canciones;

    /*Constructor canciones*/
    public CD() {
        canciones = new ArrayList(tamaño_maximo);
    }
    public int numeroCanciones() {
        return canciones.size();
    }
    public Cancion dameCancion(int i) {
        return (Cancion) canciones.get(i);
    }
    public void grabaCancion(int i, Cancion c) {
        canciones.set(i, c);
    }
    public void agrega(Cancion c) {
        canciones.add(c);
    }
     public void elimina(int i) {
        canciones.remove(i);
    }
    
     
    public void graba_Cancion(String nombre_cancion, Cancion c) {
        int estado = 0;
        for (int i = 0; i < this.numeroCanciones(); i++) {
            if (dameCancion(i).nombre.equals(nombre_cancion)) {
                estado = 1;
                grabaCancion(i, c);
            }
        }
        if (estado == 0) {
            System.out.println("Cancion no encontrada!!");
        }
    }
  
    public void eliminar_Cancion(String nombre_cancion, Cancion c) {
        int estado = 0;
        for (int i = 0; i < this.numeroCanciones(); i++) {
            if (dameCancion(i).nombre.equals(nombre_cancion)) {
                estado = 1;
                canciones.remove(c);
            }
        }

        if (estado == 0) {
            System.out.println("Cancion no encontrada");
        }
    }
    
} 

