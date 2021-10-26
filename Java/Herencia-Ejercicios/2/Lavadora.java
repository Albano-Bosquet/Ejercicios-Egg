package Ejercicio2;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer carga;

    //Constructores
    public Lavadora() {
    }

    public Lavadora(Double precio, Double peso, String color, String consumo, Integer carga) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    //Setters
    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    //Getters
    public Integer getCarga() {
        return carga;
    }

    //Metodos
    public void crearLavadora(){

        crearElectrodomestico();
        System.out.print("Indica cuanta carga soporta la lavadora (kg): ");
        carga = leer.nextInt();

        if(carga > 30){
            precio = precio + 500;
        }

    }

    @Override
    public String toString() {
        return "LAVADORA:" +
                "\n Precio: " + precio +
                "\n Peso: " + peso +
                "\n Color: " + color +
                "\n Consumo: " + consumo +
                "\n Carga: " + carga + "kg";
    }
}
