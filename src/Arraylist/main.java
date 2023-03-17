package Arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        // CapacidadVector = CapacidadVercor * 2
        //
        //CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

       // lista.remove(1);

       // System.out.println("contenido: " + lista);

        /* for (String nombre : lista) {
            System.out.println(nombre);
        }
        for (int i =0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
         */

        String array [] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for (String elemento : array){
            System.out.println("Elemento es: " + elemento);
        }

        /*for (Object arrayObject : lista.toArray()) {
            System.out.println(arrayObject.toString());

         */
        }
}


