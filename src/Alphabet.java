package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabet {
    private static final Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public List<Character> alphabet = new ArrayList<>(Arrays.asList(ALPHABET));

    private static final Character[] PUNCTUATION = {'.', ',', '"', ':', '!', '?', ' ', ';'};
    public List<Character> punctuation = new ArrayList<>(Arrays.asList(PUNCTUATION));

    public List<Character> getPunctuation() {
        return punctuation;
    }

    public List<Character> alphabetWithPunctuation = new ArrayList<>();

    public List<Character> getAlphabetWithPunctuation() {
        alphabetWithPunctuation.addAll(alphabet);
        alphabetWithPunctuation.addAll(punctuation);
        return alphabetWithPunctuation;
    }

    public int getLengthAlphabetWithPunctuation() {
        return alphabetWithPunctuation.size();
    }
}
