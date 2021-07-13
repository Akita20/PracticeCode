public class PerfectNum2 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(19));
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
    }
    public static boolean isPerfectNumber(int num){
        String result=num+"";
       // int sum=0;
        while(result.length()>1){
            int sum= 0;
            for(int i=0; i<result.length();i++){
                sum+=Math.pow(Integer.parseInt(result.substring(i,i+1)),2);

            }
            result=sum+"";
            System.out.println(sum);
        }
        return Integer.parseInt(result)==1;
    }
    public static boolean ifPerfect3(int num){
        String result=num+"";
        while(result.length()>1){
            int sum=0;
            for(int i=0; i<result.length(); i++){
                sum+=Math.pow(Integer.parseInt(result.substring(i,i+1)),2) ;

            }
            result = sum+"";
            System.out.println(sum);
        }
        return Integer.parseInt(result)==1;
    }
}
