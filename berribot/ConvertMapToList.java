package berribot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToList {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<>() ;
        map.put(1,"A");
        map.put(2,"B");

        System.out.println(convert(map));
    }

    public static List<String> convert(Map<Integer,String> map){
        List list=map.entrySet().stream().map(e->e.getKey()+"-"+e.getValue()).toList();
        return list;
    }
}
