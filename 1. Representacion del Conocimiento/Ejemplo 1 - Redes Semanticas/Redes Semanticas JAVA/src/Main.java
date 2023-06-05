import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elkin Pabon, Modelos Discretos, DCCO ESPE
 */

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> redSemantica = new HashMap<>();

        redSemantica.put("perro", List.of("animal", "mascota"));
        redSemantica.put("gato", List.of("animal", "mascota"));
        redSemantica.put("animal", List.of("ser vivo"));
        redSemantica.put("mascota", List.of("animal domesticado"));

        String nodo = "perro";
        if (redSemantica.containsKey(nodo)) {
            System.out.print("Relaciones de " + nodo + ": ");
            for (String relacion : redSemantica.get(nodo)) {
                System.out.print(relacion + " ");
            }
            System.out.println();
        }
    }
}



