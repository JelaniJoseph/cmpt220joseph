import java.util.Scanner;
public class stringreverse {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("see if a string is Palindrome: ");
        str = in.nextLine();
        String rev2 =  reverse(str);
        String ans = isPalindrome(rev2,str);
        System.out.print("The string in reverse is " + rev2+". "+ans);
    }
    public static String reverse(String s) {
        String rev = "";
        for (int i =s.length(); i > 0; i--) {
             rev = rev +(s.charAt(i-1));
        }
        return rev;
    }
    public static String isPalindrome(String s, String y) {
        if (s.equals(y)) {
            String pali = "The input is a palindrome.";
            return pali;
        }
        String nonpali = "The input is not a palindrome.";
        return nonpali;
    }
}
