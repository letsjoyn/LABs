package stringoperations;

public interface StringManipulator{
    String reverse(String input);
    String toUpperCase(String input);
    String toLowerCase(String input);
    String concatenate(String s1, String s2);
    int countVowels(String input);
    int wordCount(String input);
}