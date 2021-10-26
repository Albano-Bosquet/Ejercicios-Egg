/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Service;

/**
 *
 * @author blackstrack
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private String paginas;

    //Constructores
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, String paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    //Getters
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void MostrarLibro(){
        System.out.println("El titulo del libro es " + titulo);
        System.out.println("El autor del libro es " + autor);
        System.out.println("Las paginas del libro son " + paginas + " paginas");
        System.out.println("El codigo ISBN del libro es " + ISBN);
    }
    
    

}
