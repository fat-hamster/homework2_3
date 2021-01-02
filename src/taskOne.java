import java.util.*;

public class taskOne {
    private List<String> words;

    public taskOne() {
        fillWords();
    }

    private void fillWords() {
        String text = "Вот дом " +
                "Который построил Джек " +
                "А это пшеница " +
                "Которая в темном чулане хранится " +
                "В доме " +
                "Который построил Джек " +
                "А это веселая птица-синица " +
                "Которая часто ворует пшеницу " +
                "Которая в темном чулане хранится " +
                "В доме " +
                "Который построил Джек";

        words = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
    }

    public void findUnique() {
        Map<String, Integer> unique = new HashMap<>();
        for (String word : words) {
            Integer col = unique.get(word);
            unique.put(word, col == null ? 1 : col + 1);
        }
        unique.forEach((k, v) -> {
            if(!k.isBlank()) {
                System.out.println("Слово [" + k + "] встречается " + v + " раз");
            }
        });
    }
}
