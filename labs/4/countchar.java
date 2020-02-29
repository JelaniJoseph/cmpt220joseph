import java.util.Scanner;

public class countchar{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a text :");
        String str=in.nextLine();

        String temp="";

        //goes over all letters used 
        for(int i=0;i<str.length();i++){
            int count=0;
            char c=str.charAt(i);
            //removes any spaces or special chars
            if(Character.isAlphabetic(c)){
                for(int j=0;j<str.length();j++){
                    if(c==str.charAt(j)){
                        count++;
                    } 
            }  
        }
            if(!temp.contains(c+"")){
                System.out.println(c + " - "+ count);
                temp+=c;
            } 
        }            
    }
}











