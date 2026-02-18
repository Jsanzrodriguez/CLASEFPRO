package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;

public class Gestor {
    private ArrayList<Alumno> alumnos;

    private HashMap<String, Alumno> alumnosMap;

    public Gestor(){
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();

    }
    public void agregarAlumno(Alumno alumno){
        if(alumnosMap.containsKey(alumno.getDni())){
            System.out.println("NO se puede agregar");
        } else {
            System.out.println("Agregado correctamente");
        }
    }

}
