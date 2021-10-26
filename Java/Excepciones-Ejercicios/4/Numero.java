package Ejercicio4;

import java.util.Scanner;

public class Numero {

    Scanner leer = new Scanner(System.in);

    public int numUser;

    //Constructores
    public Numero() {
    }

    public Numero(int numUser) {
        this.numUser = numUser;
    }

    //Metodos
    public void comprobarNumero(){

        System.out.print("Escriba un numero: ");
        try {
            //Escribimos el numero que deseamos
            numUser = leer.nextInt();
        } catch (Exception e){
            //En caso de ser una letra, salta este error
            System.out.println("El caracter ingresado no es un numero, intente nuevamente");
        }

    }

}
