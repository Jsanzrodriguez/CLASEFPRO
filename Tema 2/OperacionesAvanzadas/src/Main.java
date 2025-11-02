import controller.GestorDocumental;
import controller.GestorUsuario;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.println("Ejecutables");
        Scanner scanner = new Scanner(System.in);
        GestorDocumental gestorDocumental = new GestorDocumental();
        GestorUsuario gestorUsuario = new GestorUsuario();
        gestorUsuario.evaluarUsuario("");
        gestorDocumental.archivarDocumento("");






    }







}
