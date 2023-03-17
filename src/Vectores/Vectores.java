package Vectores;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("capacity: " + vector.capacity() + " size: " + vector.size());
        vector.trimToSize();
        System.out.println("capacity: " + vector.capacity() + " size: " + vector.size());
        System.out.println(vector);


        /** for(int i : vector){
            System.out.println("valor actual del vector: " + i);
        }

        for (int i = 0; i < vector.size(); i++){
            if (i % 2 == 0){
                vector.remove(i);
                continue;
            }
            System.out.println("valor es: " + vector.get(i) + " en posicion: " + i);
        } **/


       // System.out.println("vector tamaño: " + vector.size() + " y capacidades: " + vector.capacity());
    }
}
