import java.sql.SQLOutput;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Laura");
        despedir();
        saludar("Jorge");
        despedir();
        Operaciones.sumar(4,4);
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1,5);
        operacionesMatematicas.restar(5,2);

    }
    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Animo, no decaigas en tu tarea");
        System.out.println("Vamos, a por el dia");


    }

    public static void despedir() {
        System.out.println("A cerrar el portatil y nos vamos a casa");

    }





}
