package berribot;

import java.util.List;
import java.util.stream.Stream;

public class MergeSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

    /*    List<List<Integer>> result= List.of(list1,list2);
        System.out.println(result.stream().flatMap(inner->inner.stream()).sorted().toList()
        );
    */

        System.out.println(Stream.concat(list1.stream(),list2.stream())
                .sorted()
                .toList()
        );
    }
}
