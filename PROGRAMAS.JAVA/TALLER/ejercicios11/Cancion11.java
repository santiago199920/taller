/*
"Desarrolla una clase Cancion con los siguientes atributos:
• titulo: una variable String que guarda el título de la canción.
• autor: una variable String que guarda el autor de la canción. y los
siguientes métodos:
• Cancion(String, String): constructor que recibe como parámetros el
título y el autor de la canción (por este orden).
• Cancion(): constructor predeterminado que inicializa el título y el autor
a cadenas vacías".
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    //get and set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public void dameTitulo(){
        this.titulo = titulo;
        System.out.println("Escriba el titulo de la cancion");
        titulo = entrada.nextLine();
    }
    
    public void dameAutor(){
        this.autor = autor;
        System.out.println("Escriba el nombre del autor: ");
        autor = entrada.nextLine();
    }
    
    public void ponTitulo(){
        System.out.println("El titulo es:"+titulo);
    }
    
    public void ponAutor(){
        System.out.println("El autor es: "+autor);
    }

    

}

