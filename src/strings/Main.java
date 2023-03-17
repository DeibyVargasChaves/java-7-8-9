package strings;

import java.util.Locale;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String cadena = "meNsAJe";

        int cadenaLen = cadena.length();

        System.out.println("la longitud de la cadena es: "+ cadenaLen);

        String cadenMINUS = cadena.toLowerCase();
        System.out.println("la cadena es:" + cadenMINUS);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("la cadena es:" + cadenaMayus);



    }
}