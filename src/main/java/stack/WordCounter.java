package slack;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public static void main(String[] args) {

        String text =
                "Java is easy Java is powerful Java";

        text = text.toLowerCase();


        String[] words =
                text.split("\\s+");

        TreeMap<String, Integer> wordMap =
                new TreeMap<>();

        for (String word : words) {

            if (wordMap.containsKey(word)) {

                wordMap.put(
                        word,
                        wordMap.get(word) + 1
                );

            } else {

                wordMap.put(word, 1);
            }
        }

        System.out.println(
                "===== WORD COUNT ====="
        );

        for (Map.Entry<String, Integer> entry
                : wordMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " : "
                            + entry.getValue()
            );
        }
    }
}