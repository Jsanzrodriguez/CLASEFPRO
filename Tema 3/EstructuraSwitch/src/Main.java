import java.sql.SQLOutput;

public class Main {
        public enum DiaSemana {}

    public static void main (String[] args){

            DiasSemana diaSemana = DiasSemana.Viernes;


            // solo funciona si tengo un level de 14
            switch (diaSemana) {

                case Lunes, Martes, Miercoles, Jueves -> System.out.println("Laborable");
                case Viernes -> System.out.println("Laborable, casi lo tenemos");
                case Sabado, Domingo -> System.out.println("Descanso");

            }
        MesesAnio mesActual = MesesAnio.Febrero;
        System.out.println("La fecha de hoy es 7 de "+MesesAnio.Noviembre+" de 2025 y es "+DiasSemana.Viernes);
        System.out.printf("La fecha de hoy es %d de %s de %d y es %s estamos en la estacion de %s, los dias que tiene este mes son %d%n"
                ,7,mesActual,2025,DiasSemana.Viernes,mesActual.estacion, mesActual.diasMes);

       /* final int NUMERO =12;
        //0 numero 10
        //10 numero 20
        //20 numero 30
        //level 23
        //raro que nos lo encontremos
        switch (true){
            case(NUMERO>0 && NUMERO<10) ->{
                System.out.println("23123");
            }
            case(NUMERO>10 && NUMERO<20) ->{
                System.out.println("23123");
            }
            case(NUMERO>20 && NUMERO<30) ->{
                System.out.println("23123");
            }


        }*/

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarServidor("ok_fail");
    }


}
