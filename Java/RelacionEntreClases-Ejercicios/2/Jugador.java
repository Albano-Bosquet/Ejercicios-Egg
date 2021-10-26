package Ejercicio2Final;

public class Jugador {

    RevolverDeAgua r = new RevolverDeAgua();

    private int ID;
    private String nombre;
    private boolean mojado = false;

    //Constructores
    public Jugador() {
    }

    public Jugador(int ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    //Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    //Getters
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    //Metodos
    public void disparo(){

        r.mojar();
        if(r.isMojado() == true){

            mojado = true;

        } else {

            r.siguienteChorro();

        }

    }

}
