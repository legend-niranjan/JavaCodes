package berribot;

import java.util.List;

public class SecondLargestNumberArray {

    public static void main(String[] args) {
        List<Integer> list=List.of(11,0,17,0,18,10);

        List<Integer> distinctSorted =
                list.stream()
                        .distinct()
                        .sorted()
                        .toList();

        if (distinctSorted.size() < 2) {
            System.out.println("None");
        } else {
            System.out.println(distinctSorted.get(distinctSorted.size() - 2));
        }
    }
}
