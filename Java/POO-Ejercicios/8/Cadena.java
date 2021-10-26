/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Cadena {

    private String frase;
    private int longitud;
    private String frase2;

    //Constructores
    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //Setters
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Getters
    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    //Metodos
    public void vocales() {
        
        System.out.println("VOCALES:");
        int cont1 = 0;
        int cont2 = 1;
        int contv = 0;
        String sub;
        System.out.print("La frase ingresada es: ");
        for (int i = 0; i <= (longitud - 1); i++) {
            sub = frase.substring(cont1, cont2);
            System.out.print(sub);
            if (sub.equals("a") || (sub.equals("e") || (sub.equals("i") || sub.equals("o") || sub.equals("u")))) {
                contv = (contv + 1);
            }
            cont1 = (cont1 + 1);
            cont2 = (cont2 + 1);
        }
        System.out.println("");
        System.out.println("La frase tiene " + contv + " vocales");
    }

    public void invertirFrase() {
        
        System.out.println("INVERTIR FRASE:");
        String sub;
        int cont1 = (longitud - 1);
        int cont2 = longitud;
        for (int i = 0; i <= (longitud - 1); i++) {
            sub = frase.substring(cont1, cont2);
            System.out.print(sub);
            cont1 = (cont1 - 1);
            cont2 = (cont2 - 1);

        }
        System.out.println("");

    }

    public void vecesRepetido() {
        
        System.out.println("VECES REPETIDAS:");
        String sub;
        int cont1 = 0;
        int cont2 = 1;
        int ca = 0, cb = 0, cc = 0, cd = 0, ce = 0, cf = 0, cg = 0, ch = 0, ci = 0, cj = 0, ck = 0, cl = 0, cm = 0, cn = 0, co = 0, cp = 0, cq = 0, cr = 0, cs = 0, ct = 0, cu = 0, cv = 0, cw = 0, cx = 0, cy = 0, cz = 0;
        for (int i = 0; i <= (longitud -1); i++) {
            sub = frase.substring(cont1, cont2);
            switch (sub) {
                case "a":
                    ca = (ca + 1);
                    break;
                case "b":
                    cb = (cb + 1);
                    break;
                case "c":
                    cc = (cc + 1);
                    break;
                case "d":
                    cd = (cd + 1);
                    break;
                case "e":
                    ce = (ce + 1);
                    break;
                case "f":
                    cf = (cf + 1);
                    break;
                case "g":
                    cg = (cg + 1);
                    break;
                case "h":
                    ch = (ch + 1);
                    break;
                case "i":
                    ci = (ci + 1);
                    break;
                case "j":
                    cj = (cj + 1);
                    break;
                case "k":
                    ck = (ck + 1);
                    break;
                case "l":
                    cl = (cl + 1);
                    break;
                case "m":
                    cm = (cm + 1);
                    break;
                case "n":
                    cn = (cn + 1);
                    break;
                case "o":
                    co = (co + 1);
                    break;
                case "p":
                    cp = (cp + 1);
                    break;
                case "q":
                    cq = (cq + 1);
                    break;
                case "r":
                    cr = (cr + 1);
                    break;
                case "s":
                    cs = (cs + 1);
                    break;
                case "t":
                    ct = (ct + 1);
                    break;
                case "u":
                    cu = (cu + 1);
                    break;
                case "v":
                    cv = (cv + 1);
                    break;
                case "w":
                    cw = (cw + 1);
                    break;
                case "x":
                    cx = (cx + 1);
                    break;
                case "y":
                    cy = (cy + 1);
                    break;
                case "z":
                    cz = (cz + 1);
                    break;
            }
            cont1 = (cont1 + 1);
            cont2 = (cont2 + 1);

        }
        System.out.println("La frase contiene " + ca + " a");
        System.out.println("La frase contiene " + cb + " b");
        System.out.println("La frase contiene " + cc + " c");
        System.out.println("La frase contiene " + cd + " d");
        System.out.println("La frase contiene " + ce + " e");
        System.out.println("La frase contiene " + cf + " f");
        System.out.println("La frase contiene " + cg + " g");
        System.out.println("La frase contiene " + ch + " h");
        System.out.println("La frase contiene " + ci + " i");
        System.out.println("La frase contiene " + cj + " j");
        System.out.println("La frase contiene " + ck + " k");
        System.out.println("La frase contiene " + cl + " l");
        System.out.println("La frase contiene " + cm + " m");
        System.out.println("La frase contiene " + cn + " n");
        System.out.println("La frase contiene " + co + " o");
        System.out.println("La frase contiene " + cp + " p");
        System.out.println("La frase contiene " + cq + " q");
        System.out.println("La frase contiene " + cr + " r");
        System.out.println("La frase contiene " + cs + " s");
        System.out.println("La frase contiene " + ct + " t");
        System.out.println("La frase contiene " + cu + " u");
        System.out.println("La frase contiene " + cv + " v");
        System.out.println("La frase contiene " + cw + " w");
        System.out.println("La frase contiene " + cx + " x");
        System.out.println("La frase contiene " + cy + " y");
        System.out.println("La frase contiene " + cz + " z");
    }
    
    public String compararLongitud(){
        
        System.out.println("COMPARAR LONGITUDES:");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa otra frase");
        frase2 = leer.next();
        System.out.println("La frase 1 tiene " + frase.length() + " caracteres");
        System.out.println("La frase 2 tiene " + frase2.length() + " caracteres");
        System.out.println("La longitud de la frase 1 menos la longitud de la frase 2 es " + ((frase.length()) - (frase2.length())));
        return frase2;
        
    }
    
    public void unirFrases(){
        
        System.out.println("UNIR FRASES:");
        frase2 = (frase + " " + frase2);
        System.out.println("La frase 1 concatenada con la frase 2 es: " + frase2);
    }
    
    public void reemplazar(){
        
        int cont1 = 0;
        int cont2 = 1;
        String subt, sub;
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("REEMPLAZAR:");
        System.out.println("Por que letra desea reemplazar las (a) de la frase?");
        letra = leer.next();
        subt = "La frase quedo en: ";
        for (int i = 0; i <= (longitud - 1); i++){
            sub = (frase.substring(cont1, cont2));
            if(sub.equals("a")){
                sub = letra;
            }
            subt = (subt + sub);
            cont1 = (cont1 + 1);
            cont2 = (cont2 + 1);
        }
        System.out.println(subt);
        
    }
    
    public void contiene(){
        
        System.out.println("CONTIENE:");
        String letra;
        Scanner leer = new Scanner(System.in);
        boolean cont = false;
        int cont1 = 0;
        int cont2 = 1;
        String sub;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        for (int i = 0; i <= (longitud - 1); i++){
            sub = (frase.substring(cont1, cont2));
            if (sub.equals(letra)){
                cont = true;
            }
            cont1 = (cont1 + 1);
            cont2 = (cont2 + 1);
        }
        System.out.println(cont);
        
    }

}
