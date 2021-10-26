package Ejercicio2Final;

public class RevolverDeAgua {

    private int posicionAgua, posicionActual;
    private boolean mojado = false;

    //Constructores
    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionAgua, int posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;
    }

    //Setters
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    //Getters
    public int getPosicionAgua() {
        return posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public boolean isMojado() {
        return mojado;
    }

    //Metodos
    public void llenarRevolver(){

        posicionActual = ((int)(Math.random() * 6));
        posicionAgua = ((int)(Math.random() * 6));

    }

    public void mojar(){

        if(posicionAgua == posicionActual){

            mojado = true;

        }

    }

    public void siguienteChorro(){

        if(posicionActual < 6){

            posicionActual++;

        } else {

            posicionActual = 0;

        }


    }

    @Override
    public String toString() {
        return "DATOS DEL REVOLVER DE AGUA: " +
                "\n Posicion actual: " + posicionActual +
                "\n Posicion del agua: " + posicionAgua;
    }
}
