package model;

import controller.agenda;

public class main {
    public static void main(String[] args){
        agenda agenda = new agenda();
        agenda.agregarPersona(new Persona("Jorge1", "Sanz1", "1234"));
        agenda.agregarPersona(new Persona("Jorge2", "Sanz2", "1235"));
        agenda.borrarPersona("1234");
        agenda.obtenerPersonas();
        //agenda.obtenerPersona("1239").mostrarDatos();




    }
}
