package berribot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> list1= Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5)
        );

        List<List<Integer>> list2= Arrays.asList(
                Arrays.asList(10,20),
                Arrays.asList(30,40)
        );

        System.out.println("list 1="+flatList(list1));
        System.out.println("list 2="+flatList(list2));
    }

    public static List<Integer> flatList(List<List<Integer>> listOfList1){
        List<Integer> list=listOfList1.stream().flatMap(inner->inner.stream()).toList();
        return list;
    }
}
