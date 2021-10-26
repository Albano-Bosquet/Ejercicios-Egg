package Ejercicio3E;

public class Residencia extends Extrahotelero{

    protected int cantidadHabitaciones;
    protected boolean seHacenDescuentos = false;
    protected boolean poseeCampoDeportivo = false;

    //Constructores
    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int cantidadHabitaciones, boolean seHacenDescuentos, boolean poseeCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.seHacenDescuentos = seHacenDescuentos;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    //Setters
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void setSeHacenDescuentos(boolean seHacenDescuentos) {
        this.seHacenDescuentos = seHacenDescuentos;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    //Getters
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean isSeHacenDescuentos() {
        return seHacenDescuentos;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    //Metodos
    public void crearResidencia(){

        String decision;

        System.out.print("Indique nombre de la residencia: ");
        nombre = leer.next();
        System.out.print("Indique direccion de la residencia: ");
        direccion = leer.next();
        System.out.print("Indique localidad de la residencia: ");
        localidad = leer.next();
        System.out.print("Indique gerente de la residencia: ");
        gerente = leer.next();
        System.out.print("La residencia es privada? S/N: ");
        decision = leer.next().toUpperCase();
        if(decision.equals("S")){
            privado = true;
        }
        System.out.print("Indique metros cuadrados de la residencia: ");
        metrosCuadrados = leer.nextDouble();
        System.out.print("Indique cantidad de habitaciones de la residencia: ");
        cantidadHabitaciones = leer.nextInt();
        System.out.print("En la residencia se hacen descuentos? S/N: ");
        decision = leer.next().toUpperCase();
        if (decision.equals("S")){
            seHacenDescuentos = true;
        }
        System.out.print("La residencia posee campo deportivo> S/N: ");
        decision = leer.next().toUpperCase();
        if (decision.equals("S")){
            poseeCampoDeportivo = true;
        }

    }
}
