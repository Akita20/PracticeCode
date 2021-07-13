import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindMaxArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 0, 0, 0, 9, 3, 2};
        int[] arr2 = {1, 2, 4, 9, 3, 2};

//        System.out.println(findMax(arr1));
//        System.out.println(findMin(arr1));
//        System.out.println(firstDuplicatedElementArray(arr1));

//        System.out.println(Arrays.toString(concatTwoArray(arr1, arr2)));
//        System.out.println(Arrays.toString(moveAllZeroToTheEnd(arr1)));
        char[] ch={'a','b','c'};
        printPermutation(ch);
    }

    public static int findMax(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int findMin(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static int firstDuplicatedElementArray(int[] array) {
        int firstDuplicate = 0;
        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }
            if (frequency > 1) {
                firstDuplicate = each;
                break;
            }
        }
        return firstDuplicate;
    }

    public static int[] concatTwoArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static int[] moveAllZeroToTheEnd(int[] arr1) {
        int[] result = new int[arr1.length];
        int count = 0;
        for (int each : arr1) {
            if (each != 0) {
                result[count++] = each;
            }
        }
        return result;
    }
    //Given an array of 3 characters print all permutation combinations from the given characters
// permutation is set or number of things can be ordered or arranged

public static void printPermutation(char[] ch){
        for(String s: permutation(ch)){
            System.out.println(Arrays.toString(s.toCharArray()));
        }
}

    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();// LinkedHasSet-->ordered
        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, 3) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }
        }
        return set;

    }
}


