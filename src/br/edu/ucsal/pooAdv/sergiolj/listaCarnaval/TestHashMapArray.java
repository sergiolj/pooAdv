package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMapArray {
    public static void main(String[] args) {
        String sentence = "o tempo voa o tempo é relativo";

        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words) {
            wordCount.put(word, (wordCount.getOrDefault(word, 0) + 1));
        }

        wordCount.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
