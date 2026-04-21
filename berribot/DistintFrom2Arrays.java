package berribot;

import java.util.HashSet;
import java.util.Scanner;

public class DistintFrom2Arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of first array");
        int size1 = sc.nextInt();
        int nums1[]=new int[size1];
        for (int i=0;i<size1;i++){
            nums1[i]= sc.nextInt();
        }

        System.out.println("Enter size of 2nd array");
        int size2 = sc.nextInt();
        int nums2[]=new int[size2];
        for (int i=0;i<size2;i++){
            nums2[i]= sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }

        }
        System.out.println(set);
    }
}
