package Ejercicio2E;

public enum EnumFila {

    OCHO(8), SIETE(7), SEIS(6), CINCO(5), CUATRO(4), TRES(3), DOS(2), UNO(1);

    private int code;

    //Constructores
    EnumFila() {
    }

    EnumFila(int code) {
        this.code = code;
    }

    //Setters
    public void setCode(int code) {
        this.code = code;
    }

    //Getters
    public int getCode() {
        return code;
    }
}
