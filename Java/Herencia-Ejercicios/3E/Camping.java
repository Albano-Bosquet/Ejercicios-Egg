package Ejercicio3E;

public class Camping extends Extrahotelero{

    protected int capacidadCarpas;
    protected int cantidadBanios;
    protected boolean poseeRestaurant = false;

    //Constructores
    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int capacidadCarpas, int cantidadBanios, boolean poseeRestaurant) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.poseeRestaurant = poseeRestaurant;
    }

    //Setters
    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public void setPoseeRestaurant(boolean poseeRestaurant) {
        this.poseeRestaurant = poseeRestaurant;
    }

    //Getters
    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public boolean isPoseeRestaurant() {
        return poseeRestaurant;
    }

    public void crearCamping(){

        String decision;

        System.out.print("Indique nombre del camping: ");
        nombre = leer.next();
        System.out.print("Indique direccion del camping: ");
        direccion = leer.next();
        System.out.print("Indique localidad del camping: ");
        localidad = leer.next();
        System.out.print("Indique gerente del camping: ");
        gerente = leer.next();
        System.out.print("El camping es privado? S/N: ");
        decision = leer.next().toUpperCase();
        if(decision.equals("S")){
            privado = true;
        }
        System.out.print("Indique metros cuadrados del camping: ");
        metrosCuadrados = leer.nextDouble();
        System.out.print("Indique cantidad de carpas que admite el camping: ");
        capacidadCarpas = leer.nextInt();
        System.out.print("Indique cantidad de banios que tiene el camping: ");
        cantidadBanios = leer.nextInt();
        System.out.print("El camping posee restaurant? S/N: ");
        decision = leer.next().toUpperCase();
        if(decision.equals("S")){
            poseeRestaurant = true;
        }

    }

}
