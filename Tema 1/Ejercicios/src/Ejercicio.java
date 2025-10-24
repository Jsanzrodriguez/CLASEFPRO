import java.util.Scanner;

public class Ejercicio {
    // 1.Perdir datos 2.Realizar cálculos 3. Mostrar datos (Orden a la hora de realizar los ejercicios)

    private Scanner lecturaTeclado;

    public void ejercicio1() {
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos bocatas voy a pedir");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantas bebidas vais a pedir");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocata");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("cuantas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();

        double precioBocatas = numeroBocatas * precioBocata;
        double precioBebidas = numeroBebidas * precioBebida;
        double costeTotal = precioBocatas * precioBebidas;
        double precioPersona = costeTotal / personas;

        System.out.printf("El precio de los bocatas es %.2f%n ", precioBocatas);
        System.out.printf("El precio de las bebidas es %.2f%n ", precioBebidas);
        System.out.printf("El precio total es %.2f%n ", costeTotal);
        System.out.printf("El precio por persona es %.2f%n ", precioPersona);
        lecturaTeclado.close();
    }

        public void ejercicio4(){
        lecturaTeclado = new Scanner(System.in);
            System.out.println("Cuantos segundos quieres pasar a tiempo");
            int segundosTotal= lecturaTeclado.nextInt();
            int horas = segundosTotal/3600;
            int minutos = (segundosTotal%3600)/60;
            int segundos = segundosTotal%60;
            System.out.println("El numero de horas es " +horas);
            System.out.println("El numero de minutos es " +minutos);
            System.out.println("El numero de segundos es " +segundos);







        lecturaTeclado.close();
        lecturaTeclado = null;




        }













}
