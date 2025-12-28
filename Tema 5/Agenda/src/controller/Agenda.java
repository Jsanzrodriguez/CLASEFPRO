package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {
    // atributos -> cualiicar
    //[nombre, apellido, correo, tlfno, dni]

    private ArrayList<Object[]> listaContactos;

    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    //metodos-> acciones que quiero que el objeto de la clase pueda ejecutar

    //agregar
    public void agregarContacto(Object[] contacto){
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correctamente");
    }
    //borrar
    public void borrarContacto(String dni){
       listaContactos.removeIf(new Predicate<Object[]>() {
           @Override
           public boolean test(Object[] objects) {
               return objects[4].equals(dni);
           }
       });
        /*
        for (Object[] item : listaContactos) {
            if (item[4].equals(dni)){
                listaContactos.remove(item);
                return;
            }
        }

    }*/
    //buscar
    public void buscarContacto(String dni){
        for (Object[] item : listaContactos) {
            if (item[4].equals(dni)){
                System.out.println("Contactoe cnotrado");
                System.out.println("Nombre"+item[0]);
                System.out.println("Correo"+item[2]);
                System.out.println("Telefono"+item[3]);
                return;
            }
        }
        System.out.println("No encontrado");
    }
    //listar

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Object[]> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
}

