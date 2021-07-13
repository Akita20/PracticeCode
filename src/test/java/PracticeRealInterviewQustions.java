import java.util.*;

public class PracticeRealInterviewQustions {

    public static void main(String[] args) {
//        System.out.println(strReverse("ABCD"));
//        System.out.println(Reverse("ABCD"));
//        System.out.println(removeDup("AAABBBCCC"));
//        System.out.println(removeDuplicate("AAABBBCCC"));
//        String sentence =  "The slow purple oryx meanders past the quiescent canine";
//        String sentence = "";
//        System.out.println(findMissingLetters(sentence));
//        String unique = "AAABBBCCCDEF"; // ==>  "DEF";
//        System.out.println(Unique2(unique));
//        String a1="abc";
//                String a2= "cafss";
//        System.out.println(same2(a1, a2));
//        String FrequencyOfChars="AAABBCDD"; // A3B2C1D2
//        System.out.println(frequency(FrequencyOfChars));

       String sum="absdfjjflj34jfjd55";
       System.out.println(sumOfDigits(sum));
//        String str1="DC501GCCCA098911";
//        SortLettrsAndNumberFromString(str1);
          int[]arr={11,-3,5,3,-24,56};
        System.out.println("maxValue(arr) = " + maxValue2(arr));
        System.out.println("minValue(arr) = " + minValue(arr));
    }

    /*
    Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String strReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }

    public static String Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    /*
    Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
//    public static String removeDup(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!result.contains("" + str.charAt(i)))
//                result += "" + str.charAt(i);
//        }
//        return result;
//    }
    public static String removeDuplicate1(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            if( !result.contains(""+str.charAt(i)))
                result+= ""+str.charAt(i);
        }
        return result;
    }

    public static String removeDuplicate(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(",", "").replace("[", "").replace("]", "");
        return str;
    }

    public static String findMissingLetters(String sentence) {
        String result = "";
        String temp = "";
        ArrayList<Character> alphabet = new ArrayList<>();
        for (Character i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        for (Character eachChar : alphabet) {// to find unique letter from the sentence in alphabetic order
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.toLowerCase().charAt(i) == eachChar) {
                    temp += eachChar;
                    break;
                }
            }
        }
        for (Character each : alphabet) {//compare each char from alphabet with the each char in temp string
            if (!temp.contains(each + "")) {
                result += each;
            }
        }
        return result;

    }

    // Write a return  method that can find the unique characters from the String
//    public static String findUnique(String str) {
    //  String unique="";
//        for (int i = 0; i <=str.length()-1; i++) {
//            char each= str.charAt(i);// each character of the string
//            int count= frequency


    //        String[] arr = str.split("");
//        String unique = "";
//        for (int j = 0; j < arr.length; j++) {
//            int num = 0;
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i].equals(arr[j] ) ) {
//                    num++;
//                }
//                }
//            if (num == 1) {
//                unique += arr[j];
//            }
//        }
//        return unique;
//    }
    public static String Unique2(String str) {
        String result = "";
        for (String each : str.split("")) {
            result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";

        }
        return result;
    }
//    Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:
    public static boolean same(String a, String b){
        char[] ch1= a.toCharArray();
        char[] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";
        for (char each: ch1){
            a1+=each;
        }
        for(char each: ch2){
            a2 +=each;
        }

        return a1.equals(a2);
    }
    public static boolean same2(String a, String b){
        a=new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b= new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfChars(String str){
        String expectedResult ="";
        while( !str.isEmpty()){
            int count= 0;
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)==(str.charAt(0))){
                    count ++;
                }
            }
            expectedResult +=str.charAt(0)+""+ count;
            str= str.replace(""+str.charAt(0), "");
        }
        return expectedResult;
    }
    public static String frequency(String str){
        String nonDup="", result="";
        for (int i=0; i<str.length();i++){
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+=""+str.charAt(i);
        }
        for (int i = 0; i <nonDup.length() ; i++) {
            int num= Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));
            result+= ""+nonDup.charAt(i)+num;

        }
        return result;
    }
    //Write a method that can return the sum of the digits in a string
    public static int sumOfDigits(String s){
        int total=0;
        char[]ch= s.toCharArray();
        for (char each : ch) {
            if(Character.isDigit(each)){
                total+= Integer.valueOf(""+each);
            }
        }
        return total;
    }
    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     sort the individual string and append them back together
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */
    public static void SortLettrsAndNumberFromString(String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }
            String [] arr= str2.split(",");
            str ="";
            for (String each : arr) {
                char []chars= each.toCharArray();
                Arrays.sort(chars);
                for (char eachChar : chars) {
                    str+=""+eachChar;
                }
            }
            System.out.println(str);
        }

    // find the maximum number from an int Array
    public static int maxValue(int[] n){
        int max=Integer.MIN_VALUE;
        for( int each: n){
            if(each>max)
                max= each;
        }
        return max;
    }
    public static int maxValue2(int[] n){
        Arrays.sort(n);
        return n[n.length-1];
    }
    public static int minValue(int[] n){
        int min= Integer.MAX_VALUE;
        for( int each: n){
            if(each<min)
                min= each;
        }
        return min;
    }

    }







/*
The sentence "The quick brown fox jumps over the lazy dog" contains
every single letter in the alphabet. Such sentences are called pangrams.
You are to write a function findMissingLetters, which takes a String,
sentence, and returns all the letters it is missing (which prevent it from
being a pangram). You should ignore the case of the letters in sentence,
and your return should be all lower case letters, in alphabetical order.
You should also ignore all non US-ASCII characters.

The code you submit must contain a method that conforms to the expected
function definition:

Java Definition
Public Class: PangramDetector
Method signature: public String findMissingLetters(String sentence)

Examples:

(Note that in the examples below, the double quotes should not be
considered part of the input or output strings.)

0)  "The quick brown fox jumps over the lazy dog"

Returns: ""
(This sentence contains every letter)

1)  "The slow purple oryx meanders past the quiescent canine"
Returns: "bfgjkvz"

2)  "We hates Bagginses!"
Returns: "cdfjklmopqruvxyz"

3)  ""
Returns: "abcdefghijklmnopqrstuvwxyz"
 */