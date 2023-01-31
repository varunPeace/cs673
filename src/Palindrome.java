import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        if(isPalindrome(str))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is NOT Palindrome");
    }
    public static boolean isPalindrome(String str){
        String rev = "";
        for (int i =str.length()-1; i >=0; i--){
            rev=rev + str.charAt(i);
        }
        if(str.equals(rev))
            return true;
        else
            return false;
    }
}
