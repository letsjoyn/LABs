package stringoperations;

public class StringProcessor implements StringManipulator{
    public String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }
    public String toUpperCase(String input){
        return input.toUpperCase();
    }
    public String toLowerCase(String s) { return s.toLowerCase(); }
    public String concatenate(String s1, String s2) { return s1 + " " + s2; }
    public int countVowels(String s){ return s.replaceAll("[^aeiouAEIOU]","").length();}
    public int wordCount(String s) { return s.length();}
}
