package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMapChar {
    public static void main(String[] args) {
        String sentence = "o tempo voa o tempo é relativo";
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        StringBuilder nextWord = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                nextWord.append(c);
            } else if (!nextWord.isEmpty()) {
                String word = nextWord.toString();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                nextWord.setLength(0);
            }
        }
        if (!nextWord.isEmpty()) {
            String word = nextWord.toString();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String key : wordCount.keySet()) {
            System.out.println(key + " -> " + wordCount.get(key));
        }
    }
}
