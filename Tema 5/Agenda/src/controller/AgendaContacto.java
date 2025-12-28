package controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Contacto;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor


public class AgendaContacto {

    private ArrayList<Contacto>listaContactos;

    private int id;
    public AgendaContacto(){
        listaContactos = new ArrayList<>();
         id = 1;
    }
    public void agregarContacto(Contacto contacto){
        //solo hacerlo cuando el dni del contacto a agregar no esta en la lista
        contacto.setId(id);
        listaContactos.add(contacto);
        id++;
    }
    public Contacto estaContacto(String dni){
        // dni
        // lista
        //Recorrer y pregunta
        for (Contacto contacto: listaContactos) {
            if (Contacto.getD ni().equals(dni)){
                return contacto;
            }

        }
        return null;
    }
}
