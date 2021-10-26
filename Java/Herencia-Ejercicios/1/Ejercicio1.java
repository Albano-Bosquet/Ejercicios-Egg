package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        Animal perro = new Perro("Stitch", "Carne", "Doberman", 15);
        perro.alimentarse();
        Animal perro1 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        perro1.alimentarse();
        Animal gato = new Gato("Pelusa", "Galletas", "Siames", 15);
        gato.alimentarse();
        Animal caballo = new Caballo("Spark", "Pasto", "Fino", 25);
        caballo.alimentarse();

    }
}
