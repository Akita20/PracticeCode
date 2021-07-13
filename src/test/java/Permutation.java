import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Permutation {
    //(a) -->a: if u have only one position u have only one choice-->one element one option
    //(a,b)-->(a,b),  (b,a)--: if there two position we have 2 choice
    //        (10,5), (10,5)-->2 element 2 option  -->2=2
    //(a,a)-->(a,a)--> if the two element same only one option
    //permutation means : change of positions
    //if the order make changes it is permutation
    //(a,b,c)-->(a,b,c),(b,a,c), (c,a,b),(a,c,b), (b,c,a), (c,a,b)-->3 element 6 options==>3!=6
    //(a,a,b)-->(a,a,b),(a,b,a),(b,a,a)
    //The question is about how many different
// arrangements you can make for the given char array.
// if char array has only one char in it, then you can make only one arrangement: ['a'] --> [a].
// if char array has two different chars in it, then you can make two different arrangements : ['a', 'b'] -->[a, b], [b, a].
// if char array has two same chars in it, then you can make only one arrangement : ['a', 'a'] -->[a, a].

    public static void main(String[] args) {
        // for distinct chars
        //char[] charArr1={'a'}; // 1!=1
        //char[] charArr2={'a','b'};//2!=2*1=2
        char[] charArr3 = {'a', 'b', 'c'}; // 3!=3*2*1=6
        //char[] charArr4={'a','b','c', 'd'}; // 4!=4*3*2*1=24

        /*
        System.out.println(" Original char array  and its permutations/different arrangements: " );
        printPermutation(charArr1);

        System.out.println(" Original char array  and its permutations/different arrangements: " );
        printPermutation(charArr2);

         */

        System.out.println(" Original char array  and its permutations/different arrangements: ");
        printPermutation(charArr3);
        /*
        System.out.println(" Original char array  and its permutations/different arrangements: " );
        printPermutation(charArr4);

        // for chars with repeated elements:
        char[] charArr21={'a','a'};//2!/2!=1
        char[] charArr32={'a','b','a'}; // 3!/2!=6/2=3
        System.out.println(" Original char array  and its permutations/different arrangements: " );
        printPermutation(charArr21);
        System.out.println(" Original char array  and its permutations/different arrangements: " );
        printPermutation(charArr32);

         */

    }

   /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

public static void printPermutation(char[]ch){
    for(String s: permutation(ch)){
        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
    public static Set<String> permutation(char[] ch) {
        //below line takes out commas"," and brackets"[]" from the aray and makes String str
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        //in set we keep not duplicate/unique String elements
        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1) {
            //if str has only one char in it
            set.add(str);
        } else {// if str two or more chars in it
            for (int i = 0; i < str.length(); i++) {
                System.out.println("step" + i + ":");
                System.out.println("str = " + str);

                String a3 = str.substring(0, i) + str.substring(i + 1);//substring not takes second
                System.out.println("a3 = " + a3);
                char[] ch2 = a3.toCharArray();
                System.out.println("ch2 = " + Arrays.toString(ch2));
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }

            }
        }
        return set;
    }


}
