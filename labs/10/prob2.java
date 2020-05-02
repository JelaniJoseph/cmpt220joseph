import java.io.*;
import java.util.*;

public class prob2 {

    public static void main(String[] args) throws Exception {          
        // Check command-line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText fileName oldStr newStr");
            System.exit(1);
        }
        
        // if file exists
        File f = new File(args[0]);
        if (!f.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        
        try (
        Scanner in = new Scanner(f);
        PrintWriter output = new PrintWriter(f);
        ) {
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = s1.replaceAll(args[1], args[2]); 
            output.println(s2);
        }
        in.close();
        output.close();
        }
    }  
} 