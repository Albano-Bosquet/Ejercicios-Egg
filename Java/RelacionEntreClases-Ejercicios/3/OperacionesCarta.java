package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperacionesCarta {

    Scanner leer = new Scanner(System.in);

    private ArrayList<String> cartas = new ArrayList<>();
    private ArrayList<String> cartasQueYaSalieron = new ArrayList<>();

    int cont = 0;
    int cartasDisponibles = 40;

    //Constructores
    public OperacionesCarta() {
    }

    public OperacionesCarta(ArrayList<String> cartas) {
        this.cartas = cartas;
    }

    //Setters
    public void setCartas(ArrayList<String> cartas) {
        this.cartas = cartas;
    }

    //Getters
    public ArrayList<String> getCartas() {
        return cartas;
    }

    //Metodos
    public void crearMazo(){

        for (Pinta pinta : Pinta.values()){
            for (Numeros numero : Numeros.values()){
                cartas.add(numero + " de " + pinta);
            }
        }
    }

    public void barajar(){

        Collections.shuffle(cartas);

    }

    public void siguienteCarta(){

        System.out.println();
        if(cont < 39){
            System.out.println(cartas.get(cont));
            cartasQueYaSalieron.add(cartas.get(cont));
            cartas.remove(cont);
            cartasDisponibles--;

        } else {

            System.out.println("No quedan cartas en el mazo");

        }
        cont++;

    }

    public void cartasDisponibles(){

        System.out.println();
        System.out.println("Las cartas disponibles son " + cartasDisponibles);

    }

    public void darCartas(){

        int cantidadCartas;

        System.out.println();
        System.out.print("Cuantas cartas desea recibir? : ");
        cantidadCartas = leer.nextInt();
        System.out.println("Sus cartas son:");

        for (int i = 0; i <= (cantidadCartas - 1); i++){

            System.out.println(cartas.get(i));
            cartasQueYaSalieron.add(cartas.get(i));
            cartas.remove(i);
            cartasDisponibles--;
            cont++;

        }

    }

    public void cartasMonton(){

        System.out.println();
        System.out.println("Las cartas que ya han salido son:");

        for (int i = 0; i <= (cartasQueYaSalieron.size() - 1); i++){

            System.out.println(cartasQueYaSalieron.get(i));

        }

    }

    public void mostrarBaraja(){

        System.out.println();
        System.out.println("La baraja actual es:");

        for (int i = 0; i <= (cartas.size() - 1); i++){

            System.out.println(cartas.get(i));

        }

    }

}
