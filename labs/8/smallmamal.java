public class smallmamal {

    public static class Rodent{
        void eat(){
            System.out.println("The Rodent eats whatever it can find");
        }
        void run(){
            System.out.println("The rodent runs at 8 mph!");
        }
    }

    public static class Mouse extends Rodent{
        void eat(){
            System.out.println("The Mouse eats cheese!");
        }
        void run(){
            System.out.println("The Mouse runs at 8mph!");
        }
    }

    public static class Gerbil extends Rodent{
        void eat(){
            System.out.println("The Gerbil eats fruit!");
        }
        void run(){
            System.out.println("The Gerbil runs at 8mph!");
        }
    }

    public static class Hamster extends Rodent{
        void eat(){
            System.out.println("The Hamster eats seeds");
        }
        void run(){
            System.out.println("The Hamster runs at 8mph!");
        }
    }

    public static void main(String args[]){
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[1] = new Gerbil();
        r[2] = new Hamster();

        r[0].eat();
        r[0].run();

        r[1].eat();
        r[1].run();

        r[2].eat();
        r[2].run();
    }

}