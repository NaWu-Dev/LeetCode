package easy;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode804 {

    String[] words;

    String[] alphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int result() {

        // Words in Morse Code
        HashSet<String> wordsMorse = new HashSet<>();
        for (String word : words) {
            wordsMorse.add(getCode(word));
        }

        return wordsMorse.size();

    }

    private String getCode(String word) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : word.toCharArray()) {
            stringBuilder.append(alphabet[c - 'a']);
        }

        return stringBuilder.toString();

    }

    public leetcode804(String[] words) {
        this.words = words;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }
}
