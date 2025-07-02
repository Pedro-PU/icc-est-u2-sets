package controllers;

import java.util.TreeSet;
import java.util.Set;
import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {
    
    public ContactoController(){
        runTreeContacto();
        runTreeContactoConNumero();
        
    }
    private void runTreeContacto(){
        System.out.println("\tContactos orden alfabético apellido - nombre");
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> contactos = new TreeSet<>(contactoComparator);
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for(Contacto c: contactos){
            System.out.println(c.toString());
        }

    }
    private void runTreeContactoConNumero(){
        System.out.println("\tContactos orden alfabético apellido - nombre - telefono");
        ContactoComparatorConNumero contactoComparator = new ContactoComparatorConNumero();
        Set<Contacto> contactos = new TreeSet<>(contactoComparator);
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for(Contacto c: contactos){
            System.out.println(c.toString());
        }
    }
}
