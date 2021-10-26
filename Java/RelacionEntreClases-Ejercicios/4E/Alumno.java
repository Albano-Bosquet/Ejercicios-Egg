package Ejercicio4E;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombreCompleto;
    private String documento;
    private int cantidadVotos;

    int contNombre;
    int contApellido;
    int numDoc;
    String numDocString = ": ";

    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<String> apellidos = new ArrayList<>();

    //Constructores
    public Alumno() {
    }

    public Alumno(String nombreCompleto, String documento, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.cantidadVotos = cantidadVotos;
    }

    //Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    //Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    //Metodos
    public void crearListaNombres(){

        for (Nombres nombre : Nombres.values()){
            nombres.add(nombre.toString());
        }

        for (Apellidos apellido : Apellidos.values()){
            apellidos.add(apellido.toString());
        }

    }

    public void crearAlumno(){

        //Generamos un nombre y un apellido aleatorio entre un listado ya predefinido
        contNombre = (int) (Math.random() * 10);
        contApellido = (int) (Math.random() * 10);

        //Cargamos el nombre completo al programa
        nombreCompleto = nombres.get(contNombre) + " " + apellidos.get(contApellido);

        //Generamos el primer numero del documento, va entre 1 y 9
        for (int i = 0; i <= 0; i++){

            numDoc = (int) (Math.random() * 9) + 1;
            numDocString = numDocString + numDoc;

        }

        //Generamos los numeros que faltan, van entre 0 y 9
        for (int i = 0; i <= 6; i++){

            numDoc = (int) (Math.random() * 10);
            numDocString = numDocString + numDoc;

        }

        //Cargamos el numero de documento ya terminado
        documento = numDocString;

        //Generamos un numero aleatorio para la cantidad de votos del alumno
        cantidadVotos = (int) (Math.random() * 100);

    }

}
