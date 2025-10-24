import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Laura");
        despedir();
        saludar("Jorge");
        despedir();
        Calculadora.sumar(4,4);
        Calculadora operacionesMatematicas = new Calculadora();
        operacionesMatematicas.sumar(1,5);
        operacionesMatematicas.restar(5,2);
        operacionesMatematicas.sumar(2,7);
        operacionesMatematicas.multiplicar(7,3);
        System.out.println(operacionesMatematicas.multiplicar(7,3)*4);
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que numero quieres validar ");
        int numeroValidar = lectorTeclado.nextInt();
        System.out.println("El numero que se intenta validar tiene como resultado "
                +operacionesMatematicas.validarNumero(60));

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
