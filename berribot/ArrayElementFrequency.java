package berribot;

import java.util.*;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int arr[]= {1,1,5,5,5,4,4,4,3};
        //printFrequencyOfElement(arr);
        printFrequencyOfElementWithHashMap(arr);
    }
    static void printFrequencyOfElement(int arr[]){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                System.out.println(arr[i]+"-"+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+"-"+count);

    }

    static void printFrequencyOfElementWithHashMap(int arr[]){
        LinkedHashMap<Integer, Integer> map= new LinkedHashMap<>();

        for (int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
