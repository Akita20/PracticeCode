public class PerfectNumber {
    public static void main(String[] args) {
        //Check if the given number is perfect or not
        // return true if n is perfect
        //System.out.println("");
        //int n=6;
        // System.out.println("isPerfect(n) = " + isPerfect(35));
        //Starting with any positive integer, replace the number by the sum of the squares of its digits.
        //Those numbers for which this process ends in 1 are perfect.
        //Expanded:
        //1 * 1 + 9 * 9 = 82
        //8 * 8 + 2 * 2 = 68
        //6 * 6 + 8 * 8 = 100
        //1 * 1 + 0 * 0 + 0 * 0 = 1
//        System.out.println("Belowe are all perfect"+ " number till 100");
//        for (int i=2; i<100; i++){
//            if(isPerfect(i)){
//                System.out.println(i+ " is a perfect number");
//            }
//        boolean b= isPerfect(n);
//        if (b)
//            System.out.println("Its a perfect");
//        else
//            System.out.println("its not");
//        }


//    public static boolean isPerfect(int n){
//        // to store sum of divisors
//        //6-> 1+2+3=6;
//        int sum=0;
//        //find all divisors and add them
////        for( int i=2; i*i<=n; i++){
////            if(n %i==0){
////                if(i*i !=n){
////                    sum = sum +i +n/i;
////                }else {
////                    sum = sum+i;
////                }
//        for (int i=1; i<n; i++){
//            if(n%i==0)
//                sum= sum +i;
//
//            }
//        if( n==sum)
//            return true;
//        return false;
//        }
        // is sum of divisors is equal to n, then n is a perfect number
//        if(sum == n && n !=1){
//            return true;
//        }
//        return false;
//    }
        // public static void main(String[] args) {
        /*
          System.out.println("isPerfect(n) = " + isPerfect(35));
        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Those numbers for which this process ends in 1 are perfect.
        Expanded:
        1 * 1 + 9 * 9 = 82
        8 * 8 + 2 * 2 = 68
        6 * 6 + 8 * 8 = 100
        1 * 1 + 0 * 0 + 0 * 0 = 1
         */

        //     System.out.println(perfectNumber(19));


    }

    //    public static boolean perfectNumber(int num) {
//
//        String result = num +""; // create one string for calculating the digit and store the num
//
//        while (result.length() > 1) {// num length should be > 1
//            int sum = 0;
//
//            for (int i = 0; i < result.length(); i++) {
//
//                sum +=  Math.pow(Integer.parseInt(result.substring(i,i+1)),2);// this formula find the power of digits, if we have two digit , sum of the squares
//
//            }
//
//            result = sum +""; System.out.println(sum);
//        }
//    //boolean isPerfectNumber=Integer.parseInt(result);
//        return Integer.parseInt(result) == 1;// if sum of the process ends in 1
//        //
//
//    }

    public static boolean perfectNumber(int num) {
        String result = num + " ";
        while (result.length() > 1) {
            int sum = 0;
            for (int i = 0; i < result.length(); i++) {
                sum += Math.pow(Integer.parseInt(result.substring(i, i + 1)), 2);
            }
            //this formola find power of the digits
            result = sum + "";
            System.out.println(sum);
        }
        return Integer.parseInt(result) == 1;
    }
}



