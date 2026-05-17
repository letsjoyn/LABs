package applications;

import stringoperations.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProcessor sp = new StringProcessor();

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        System.out.println("Reverse: " + sp.reverse(s1));
        System.out.println("Upper: " + sp.toUpperCase(s1));
        System.out.println("Lower: " + sp.toLowerCase(s1));
        System.out.println("Concat: " + sp.concatenate(s1, s2));
        System.out.println("Vowels: " + sp.countVowels(s1));
        System.out.println("Words: " + sp.wordCount(s1));
        sc.close();
    }
}