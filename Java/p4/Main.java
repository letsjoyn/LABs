import java.util.Scanner;

class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
    
}
class ShortStringException extends Exception {
    public ShortStringException(String message) { 
        super(message); 
    }
}

public class Main{
    
    static void checkpalindrome(String s) throws InvalidInputException,ShortStringException{

        if(s.length()<3){
            throw new ShortStringException("Enter string greater the 3 characters.");
        }
        
        if(!s.matches("[a-zA-Z]+")){
            throw new InvalidInputException("Only Aplhnumeric allowed");
        }
        String s1=s.toLowerCase();
        String s2=new StringBuffer(s1).reverse().toString();

        if(s1.equals(s2)){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        try {
            checkpalindrome(input);
        } 
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        sc.close();
    }
}