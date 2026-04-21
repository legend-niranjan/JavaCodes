package berribot;

public class FindA2B3C2A2 {
    public static void main(String[] args) {
        String str="AA BBB CC AA DDDDD";
        printCharwithLength(str);

    }
    static void printCharwithLength(String str){
        String strArr[]=str.split(" ");

        for(String group: strArr){
            System.out.print(group.charAt(0)+""+group.length()+" ");
        }
    }
}
