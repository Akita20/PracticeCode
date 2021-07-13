public class DivideWithoutOperator {
    public static void main(String[] args) {
        int num1= 3, num2=0;
    // System.out.println(divides(4,9) );


   // public static void divides(int num1, int num2){
        if(num2 ==0){
            System.out.println("Invalid number");
            return;
        }
        System.out.print(num1 +"divide by"+ num2 +" is: ");
        int count=0;
        while(num1>=num2){
            num1-=num2;
            count ++;
        }
        System.out.println(count+" and reminder is "+ num1);
    }


}
