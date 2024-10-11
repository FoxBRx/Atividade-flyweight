import java.util.HashMap;
import java.util.Map;

public class CorFactory {

    private static Map< String, Cor > map = new HashMap<>();

    public static Cor getCor(String nome) {

        if (!map.containsKey(nome)) {
           Cor tipoDeCor = new Cor(nome);
            map.put(nome, tipoDeCor);
            return tipoDeCor;
        } else {
            return map.get(nome);
        }

    }
}
