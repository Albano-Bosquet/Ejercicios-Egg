package Ejercicio1;

/**
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
 * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
 * código con una cláusula try-catch para probar la nueva excepción que debe ser
 * controlada.
 */

public class Ejercicio1 {
    public static void main(String[] args) {

    //Variables
    int contbien = 0;
    int contabajo = 0;
    int contarriba = 0;
    int contedad = 0;
    int contedadm = 0;

    //Creacion de objetos
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Persona p3 = new Persona();
    Persona p4 = new Persona();
    Persona p5 = new Persona(null, 0, null, 75, 1.75);
    p5.esMayorDeEdad();

    //Rellenar datos de objetos
        System.out.println("Rellene los datos para la persona 1");
        p1.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 2");
        p2.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 3");
        p3.crearPersona();
        System.out.println("");
        System.out.println("Rellene los datos para la persona 4");
        p4.crearPersona();
        System.out.println("");

    //Peso ideal
        if(p1.pesoI == -1){
        contbien = (contbien + 1);
    }
        if(p2.pesoI == -1){
        contbien = (contbien + 1);
    }
        if(p3.pesoI == -1){
        contbien = (contbien + 1);
    }
        if(p4.pesoI == -1){
        contbien = (contbien + 1);
    }
        System.out.println("El porcentaje de personas que estan en su peso ideal es de " + ((contbien * 100) / 4) + "%");

    //Por debajo
        if(p1.pesoI == 0){
        contabajo = (contabajo + 1);
    }
        if(p2.pesoI == 0){
        contabajo = (contabajo + 1);
    }
        if(p3.pesoI == 0){
        contabajo = (contabajo + 1);
    }
        if(p4.pesoI == 0){
        contabajo = (contabajo + 1);
    }
        System.out.println("El porcentaje de personas que estan por debajo de su peso ideal es de " + ((contabajo * 100) / 4) + "%");

    //Por encima
        if(p1.pesoI == 1){
        contarriba = (contarriba + 1);
    }
        if(p2.pesoI == 1){
        contarriba = (contarriba + 1);
    }
        if(p3.pesoI == 1){
        contarriba = (contarriba + 1);
    }
        if(p4.pesoI == 1){
        contarriba = (contarriba + 1);
    }
        System.out.println("El porcentaje de personas que estan por encima de su peso ideal es de " + ((contarriba * 100) / 4) + "%");

    //Mayor de edad
        if(p1.mayor == true){
        contedad = (contedad + 1);
    }
        if(p2.mayor == true){
        contedad = (contedad + 1);
    }
        if(p3.mayor == true){
        contedad = (contedad + 1);
    }
        if(p4.mayor == true){
        contedad = (contedad + 1);
    }
        System.out.println("El porcentaje de personas mayores es de " + ((contedad * 100) / 4) + "%");

    //Menor de edad
        if(p1.mayor == false){
        contedadm = (contedadm + 1);
    }
        if(p2.mayor == false){
        contedadm = (contedadm + 1);
    }
        if(p3.mayor == false){
        contedadm = (contedadm + 1);
    }
        if(p4.mayor == false){
        contedadm = (contedadm + 1);
    }
        System.out.println("El porcentaje de personas menores es de " + ((contedadm * 100) / 4) + "%");

}

}
