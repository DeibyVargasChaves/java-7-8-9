package mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class main {
    public static void Main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("clave1",10);
        map.put("clave2",20);
        map.put("clave3",30);

        //map.remove("clave2");
        map.replace("clave3", 190);

        //System.out.println(map.get("clave3"));

        for (Entry elemento : map.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

    }
}
