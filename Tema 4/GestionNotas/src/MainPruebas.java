import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class MainPruebas {
    public static void main(String[] args){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Jorge","Sanz","1234A",8 );
        Alumno alumno2 = new Alumno("Maria","Lopez","2345A" );
        Alumno alumno3 = new Alumno("Juan","Gomez","345A" );
        Alumno alumno4 = new Alumno("Pepe","Jimenez","456B" );
        Alumno alumno5 = new Alumno("Laura","Gomez","567B" );

        alumnos.add(new Alumno("Jorge","Sanz","1234A",8 ));
        alumnos.add(new Alumno("Maria","Lopez","2345A" ));
        alumnos.add(new Alumno("Juan","Gomez","345A" ));
        alumnos.add(new Alumno("Pepe","Jimenez","456B" ));
        alumnos.add(new Alumno("Laura","Gomez","567B" ));

        /*for (Alumno item : alumnos) {
            item.mostrarDatos();
        }*/
        //funciones de flecha - lambda se llaman despues de otras funciones
        //param -> cuerpo
        //Tras la llamada a la funcion foreach, se llama en cada iteracion
        // a la funcion definida en los parametros
        /*alumnos.forEach(element-> {
            System.out.println("Vamos a imprimir los datos de "+element.getNombre());
            element.mostrarDatos();
        });*/
        // y si quiero imprimir solo las notas
        //alumnos.forEach(data-> System.out.println(data.getNota()));
        //foreach -> Recorro y en cada iteracion obtengo un alumno
        // map -> recorro y transformo

        BiFunction<Integer, Integer, Integer> funcionMulti = (p1,p2)->p1*p2;
        /*
        public int suma(int p, int p)
        */
        alumnos.stream()
                .map(Alumno::getNota)
                .forEach(nota -> System.out.println(funcionMulti.apply(nota,2)));

        }
    }

