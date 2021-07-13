import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {

    /*
    public static void main(String[] args) {
           String[] titlesArray = { “Pluto TV Kids”, “CNET”, “Pluto TV Sports”, “Naturescape”, “Fear Factor”, “Flicks of Fury”,
                      “PeopleTV”, “Rescue 911", “The Amazing Race”, “Pluto TV Drama Life”, “Western TV” };
           String[] categoriesArray = { “5c12fe491c932b67bd8e3d80", “5c12f932be491cbd678e3d87”, “5c12fe491cbd932b678e3d8f”,
                      “5cffe094ad44e55543791bfc”, “5f19a84079572700079d28e0", “5c12fe2b678e3491cbd93d84”,
                      “5c12fe491cbd932b678e3d7b”, “5f18407959a72700079d28e0”, “5f197995727a808e04070d20",
                      “5f19a84079572700079d28e0”, “5f19a8763eae7b0007f5c45e” };
           /**
           * Objective:
           * Write a method that takes in the 2 arrays provided as parameters then displays the values as:
           *          “title”, “category”
           * In main, call the method that was created to test the function.
           */

    public static void main(String[] args) {
        String[] titlesArray = { "Pluto TV Kids", "CNET", "Pluto TV Sports”, “Naturescape", "Fear Factor", "Flicks of Fury",
            "PeopleTV", "Rescue 911", "The Amazing Race", "Pluto TV Drama Life", "Western TV "};
        String[] categoriesArray = { "5c12fe491c932b67bd8e3d80", "5c12f932be491cbd678e3d87", "5c12fe491cbd932b678e3d8f",
                      "5cffe094ad44e55543791bfc", "5f19a84079572700079d28e0", "5c12fe2b678e3491cbd93d84",
                     " 5c12fe491cbd932b678e3d7b", "5f18407959a72700079d28e0", "5f197995727a808e04070d20",
                      "5f19a84079572700079d28e0", "5f19a8763eae7b0007f5c45e" };
        //System.out.println("categories(titlesArray,categoriesArray) = " + categories(titlesArray, categoriesArray));
        System.out.println(categories(titlesArray,categoriesArray));
    }
    public static Map<String, String> categories(String[] titlesArray, String[] categoryArray){
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < titlesArray.length; i++) {
            map.put(titlesArray[i],categoryArray[i] );

        }
        return map;
    }

}


