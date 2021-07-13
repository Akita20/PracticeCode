import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class removeAhmad {

    public static void main(String[] args) {
        String[]arr={"Ahmed", "John", "Eric", "Ahmed"};
        ArrayList<String> names= new ArrayList<>(Arrays.asList(arr));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        List<String> name2=new ArrayList<>(Arrays.asList(arr));
        for (ListIterator<String> it= name2.listIterator();it.hasNext();)
            if(it.next().equals("Ahmed"))
                it.remove();
        System.out.println(name2);


    }

}