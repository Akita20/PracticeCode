public class PrimeNumber {
    public static void main(String[] args) {
      int num = 31;
        System.out.println("primeNumber(num) = " + primeNumber(num));
      //  System.out.println("fib(num) = " + fib(7));
    }

    public static boolean primeNumber(int num) {// prime number is greater than 1 and only have 2 factors --1 and number itself
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int fib(int num){
        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }
        return result;  // 0 1 1 2 3 5 8 13 21 34
    }
}
