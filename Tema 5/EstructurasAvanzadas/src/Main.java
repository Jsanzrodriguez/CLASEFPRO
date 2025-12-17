import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Colecciones dinamicas
            // Arraylist -> [34,12,15,48,785,15,151,5,516]
        ArrayList<Integer> listaCosas = new ArrayList<>();
        // el tamaño de la lista -> 0
        System.out.println("El tamaño es de "+listaCosas.size());
        listaCosas.add(5);
        listaCosas.add(15);
        listaCosas.add(25);
        System.out.println("El tamaño actualizado es " +listaCosas.size());
        listaCosas.remove(1);
        System.out.println("El tamaño actualizado es " +listaCosas.size());
        System.out.println("El elemento en posicion 1 es "+listaCosas.get(1));
        for (Integer item : listaCosas) {
            System.out.println(item);
        }
        //tamaño fijo -> estructuras estaticas

        int numero = 2;
        Scanner scanner = new Scanner(System.in);
        /*String[] palabras = new String[]{"programacion","curiosidad", "adios", "elemento", "ordenacion", "hola"};
        int[] numeros = new int[]{21, 12, 33, 14, 25, 6, 17};
        //Arrays.sort(palabras);

        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()){
                    return -1;
                }
                    return 0;
            }
        });
        for (String item : palabras) {
            System.out.println(item);
        }*/






        /*System.out.println("Dime que cantidad de datos te quieres quedar");
        int cantidad = scanner.nextInt();
        numeros = Arrays.copyOf(numeros,cantidad);
        for (int item : numeros) {
            System.out.println(item);
        }*/

        /*for (int item : numeros) {
            System.out.println(item);
        }
        //simulas eliminar uno de los elementos
        System.out.println("Indica que numero quieres borrar");
        int numeroBorrar = scanner.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBorrar) {
                numeros[i] = -1;
                break;
            }
        }
        for (int item : numeros) {
            System.out.println(item);
        }
        */
    }

}
