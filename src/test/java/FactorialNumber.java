public class FactorialNumber {
    public static void main(String[] args) {
      int num=4;
      System.out.println("factorialNumber(num) = " + factorialNumber(num));
     String  sentence ="  Hello world      I      love      Java    ";//
//        Output: Hello world I love Java
     //  System.out.println(removeTheSpace(sentence));
        System.out.println(removeWhiteSpace(sentence));
      //  int num=8;
        System.out.println(factorialNUm(num));

    }
   //Write a return method that returns the factorial number of any given number
    public static int factorialNumber(int n ){
        int result=1;// factorial number can not be 0
        for (int i=1; i<=n; i++){// 2!  =2*1   3!= 1*2*3   n!= n*n   5!=1*2*3*4*5
            result = result*i;
        }
        return result;
    }
    //then in sentence with a lot of spaces, leave only 1 spaces in the sentence,
    public static String removeTheSpace(String str){
        String[]words=str.trim().split(" ");
        String result="";
        for(String each: words){
            if( !each.isEmpty()){
                result +=each +" ";
            }
        }
     return result;
    }
//    //using interface create classes to find area and parameters of different squares.
//   int edge;
//    public int calculateArea(){
//        return edge *edge;
//    }
//    public int calculatePrimeter(){
//        return edge* 4;
//    }
    public static String removeWhiteSpace(String str){
        String []words= str.trim().split(" ");
        String result= "";
        for( String each: words){
            if(! each.isEmpty()){
                result+=each+" ";
            }
        }
        return result;
    }
    public static int factorialNUm(int num){
        int result= 1;// factorial num can not be null
        for(int i=1; i<=num;i++){
            result =i*result;
        }
        return result;
    }


}
