package berribot;

import java.util.*;

public class FindMaxInListWIthCollection {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        List<Integer> list1= List.of(10,20,40,5);

        System.out.println(maxElement(list));
        System.out.println(maxElement(list1));

        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,900);
        map.put(4,5);
        System.out.println("///"+Collections.max(map.values()));

        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.addAll(List.of(1,10,5,50,63));
        set.addAll(list);

        System.out.println(Collections.max(set));
        System.out.println("set: "+set);
    }

    static int maxElement(List<Integer> list){
        return Collections.max(list);
    }
}
