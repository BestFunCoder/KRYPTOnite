package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    private static final Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList(ALPHABET));

    private static final Character[] PUNCTUATION = {'.', ',', '"', ':', '!', '?', ' ', ';'};
    public ArrayList<Character> punctuation = new ArrayList<>(Arrays.asList(PUNCTUATION));

    public ArrayList<Character> getPunctuation() {
        return punctuation;
    }

    public ArrayList<Character> alphabetWithPunctuation = new ArrayList<>();

    public ArrayList<Character> getAlphabetWithPunctuation() {
        alphabetWithPunctuation.addAll(alphabet);
        alphabetWithPunctuation.addAll(punctuation);
        return alphabetWithPunctuation;
    }

    public int getLengthAlphabetWithPunctuation() {
        return alphabetWithPunctuation.size();
    }
}
