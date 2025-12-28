package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLOutput;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contacto {


        private int id;
        private String nombre, apellido, dni;
        private int telefono;

    public Contacto(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void mostrarDatos(){

        System.out.println("Mostrando los datos del contacto "+nombre);
        System.out.println("id = "+id);
        System.out.println("apellido = "+apellido);
        System.out.println("dni = "+dni);
        System.out.println("telefono = "+telefono);
    }
}
