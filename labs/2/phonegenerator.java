import java.util.Random;

public class phonegenerator {
    public static void main(String[] args){
        Random rand = new Random();
        // Made 3 diff random int variables in format of phone number that generates series of random numbers
        int area = (rand.nextInt(7) + 2) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);

        int digits = (rand.nextInt(9) + 2) * 100 + (rand.nextInt(7) * 5) + (rand.nextInt(4));

        int last = (rand.nextInt(6) + 2) * 1000 + (rand.nextInt(9) * 10) + rand.nextInt(7);

        System.out.print("Here is a phone number:" + "(" + area + ")" + digits + "-" + last);

    }
}
