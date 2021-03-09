/*
 * "To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor".
 */
package ejercicio13;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Cancion {
    
    String nombres;
    int duracion;
    String autor;

    public Cancion(String nombres, int duracion, String autor) {
        this.nombres = nombres;
        this.duracion = duracion;
        this.autor = autor;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombres;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrar(){
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Duracion: "+this.duracion+" minutos");
        System.out.println("Autor: "+this.autor);
    }
    
}
