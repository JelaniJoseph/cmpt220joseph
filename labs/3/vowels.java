import java.util.Scanner;

public class vowels{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Number of  Vowels in the string: " + vowel_count(str));
    }
    public static int vowel_count(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        
        return count;
    }
}
