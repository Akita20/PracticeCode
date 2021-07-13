import java.util.Arrays;
import java.util.List;

public class StreamPractice1 {

    public static void main(String[] args) {
        List<Integer> myInts= Arrays.asList(2,4,6,7,5,3);
        myInts
                .stream()
                .filter(p-> (p>3))// keep everything freater than 3
                .sorted()
                 .forEach(System.out::println);//
        System.out.println("====whatever you did in the stream remains in the stream");
        System.out.println("myInts = " + myInts);

        Integer sum=myInts.stream().reduce(0,(a,b)-> a+b);
        System.out.println("sum = " + sum);
        Integer mult=myInts.stream().reduce(1,(a,b)-> a*b);
        System.out.println("mult = " + mult);
        System.out.println("myInts = " + myInts);
        myInts.stream().filter(p-> p>4).forEach(System.out::println);

       Integer sum1= myInts.stream().reduce(1,(a,b)->a+b);
       Integer sum2= myInts.stream().reduce(1,Utilities::add);
    }
    public static class Utilities{
        public static int add(int a, int b){return a+b;}
        public static int mult(int a, int b){return a*b;}
    }
}
