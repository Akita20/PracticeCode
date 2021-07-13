import java.util.Arrays;
import java.util.List;

public class AmazonCountGroup {

        public static int countGroups(List<String> related){
            //write your code here
            int numberOfGroups=0;
            int N=related.size();// this is the max number of books
            // a subscriber can gift a book from his/her library: there are N+1 people
            // so we deal with (N+1)x(N+1) matrix; so the string length must be also N+1.
            // i gives a book to j:  ---> M[i][j]=1;
            // i does not give a book to j ---> M[i][j]=0
            // M[i][i]=1
            for (int i = 0; i <N; i++) {// row
                for (int j = 0; j <N; j++) {//column
                    if(i!=j && related.get(i).substring(j,j+1).equals("1")){
                        numberOfGroups++;
                    }
                }
            }
            return numberOfGroups;
        }

        public static void main(String[] args) {

            List<String> rows= Arrays.asList(new String[]{"110", "110", "001"});
          // List<String> rows= Arrays.asList(new String[]{"1001", "0110", "0110","1001"});
            System.out.println("countGroups(rows) = " + countGroups(rows));

        }
    }

