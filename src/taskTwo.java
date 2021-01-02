import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class taskTwo {
    private Map<String, String> phoneBook;

    public taskTwo() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        phoneBook.put(phone, name);
    }

    public String get(String name) {
        StringBuilder ret = new StringBuilder();
        phoneBook.forEach((k, v) -> {
            if(v.equalsIgnoreCase(name)) {
                ret.append(name);
                ret.append(": ");
                ret.append(k);
                ret.append('\n');
            }
        });
        if(ret.isEmpty()) {
            ret.append("Не найдено имя");
        }
        return ret.toString();
    }
}
