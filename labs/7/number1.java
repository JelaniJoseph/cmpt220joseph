public class number1{

    public static class MyLong {
        public long mvalue;

        public MyLong(long value) {
            mvalue = value;
        }

        // getter for value
        public long getValue() {
            return mvalue;
        }
        // methods that check if number is even odd or prime
        public boolean isEven() {
            return mvalue % 2 == 0;
        }
        public boolean isOdd() {
            return mvalue % 2 == 1;
        }
        public boolean isPrime() {
            if (mvalue == 1 || mvalue == 2) {
                return true;
            } else {
                for (long i = 2; i < mvalue; i++) {
                    if (i % mvalue == 0)
                        return false;
                }
            }
            return true;
        }

        // static methods below of even odd and prime that return true if number is even
        // odd or prime
        public static boolean isEven(long MyLong) {
            return (MyLong % 2) == 0;
        }
        public static boolean isOdd(long MyLong) {
            return (MyLong % 2) == 1;
        }
        public static boolean isPrime(long MyLong) {
            if (MyLong == 1 || MyLong == 2) {
                return true;
            }
            else {
                for (long i = 2; i < MyLong; i++) {
                    if (i % MyLong == 0) return false;
                }
            }
            return true;
        } 
        //methods that return true if value in object is equal to specific value
        public static boolean isEven(MyLong myInt) {
            return myInt.isEven();
        }
    
        public static boolean isOdd(MyLong myInt) {
            return myInt.isOdd();
        }
    
        public static boolean isPrime(MyLong myInt) {
            return myInt.isPrime();
        }
        // equals and parse methods 
        public boolean equals(int testInt) {
            if (testInt == mvalue) 
                return true;
            return false;
        }
    
        public boolean equals(MyLong myInt) {
            if (myInt.mvalue == this.mvalue) 
                return true;
            return false;
        }
    
        public static int parseInt(char[] values) {
            int sum = 0;
            for (char i : values) {
                sum += Character.getNumericValue(i);
            }
            return sum;
        }
    
        public static int parseInt(String value) {
            return Integer.parseInt(value);
        }
        
    }
    public static void main(String[] args){
        MyLong int1 = new MyLong(23);
        MyLong int2 = new MyLong(56);
        MyLong int3 = new MyLong(2);
        MyLong int4 = new MyLong(23);
        
        // print statements to display result to user 
        System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d is prime? %s%n", int3.getValue(), int3.isPrime());

        System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven());
        System.out.printf("%d is even? %s%n", int3.getValue(), int3.isEven());

        System.out.printf("93 is odd? %s%n", MyLong.isOdd(93));
        
        System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

        System.out.printf("%d%n", MyLong.parseInt(new char[] {'1', '5', '6'}));
        System.out.printf("%d%n", MyLong.parseInt("454"));
    }

}