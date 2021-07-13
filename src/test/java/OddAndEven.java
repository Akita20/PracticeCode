public class OddAndEven {
    public static void main(String[] args) {
        int a= 6, b=7;
      System.out.println(identifyOddEven(a));
//        System.out.println("identifyOddEven(b) = " + identifyOddEven(b));



    }
    public static String identifyOddEven(int n){
       return n%2==0? "Even": "odd";
    }

/*
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number.
for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
    public static String FINRA(){

        String result="";
        for(int i=1; i<=30; i++){
            if( i% 5==0 && i%3==0)
                result +="FINRA";
            if(i %3==0)
                result +="FIN";
            if(i % 5==0)
                result +="RA";
                else
                    result +=" ";
            }

        System.out.println(result);
        return result;
    }
    public static String oddEven(int num){
        return num %2==0 ? "Even": "odd";
    }
    }

