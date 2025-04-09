import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99999999");

        cookies.remove("email");

        for (String kay : cookies.keySet()){
            System.out.println(kay + " " + cookies.get(kay));
        }
    }
}
