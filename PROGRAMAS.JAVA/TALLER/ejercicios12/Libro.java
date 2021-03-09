/*
"Crea una clase Libro que modele la información que se mantiene en una biblioteca
sobre cada libro: título, autor (usa la clase Persona), ISBN, páginas, edición, 
editorial , lugar (ciudad y país) y fecha de edición (usa la clase Fecha). 
La clase debe proporcionar los siguientes servicios: getters y setters, método 
para leer la información y método para mostrar la información. Este último 
método mostrará la información del libro con este formato:
Título: Introduction to Java Programming 3a. edición
Autor: Liang, Y. Daniel ISBN: 0-13-031997-X
Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de 2001
784 páginas".
 */
package ejercicio12;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private String ISBN;
    private String editorial;
    private String lugar;
    private String fecha;
    private int numPaginas;

    /*Constructor*/
    public Libro(String nombre, String autor, String ISBN, String editorial, String lugar, String fecha, int numPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fecha = fecha;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    /*To String*/

    @Override
    public String toString() {
        return "Libro\n" + "Titulo: " + titulo + "\n Autor: " + autor + "\nISBN: " + ISBN + "\nEditorial:" + editorial + "\nLugar=" + lugar + "\nFecha: " + fecha + "\nNumero de paginas: " + numPaginas + '}';
    }
    
    
}
