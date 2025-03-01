package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCountArray {
    public static void main(String[] args) {
        String sentence = "o tempo voa o tempo é relativo";

        String[] words = sentence.split("\\s+");

        Map<String, Integer> countWords = new LinkedHashMap<>();

        for (String word : words) {
            countWords.put(word, (countWords.getOrDefault(word, 0) + 1));
        }

        for (String key : countWords.keySet()) {
            System.out.println(key + " -> " + countWords.get(key));
        }
    }
}
