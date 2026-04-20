import java.util.Scanner;

public class stringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size=sc.nextInt();
        String imp[]=new String[size];
        int totalLength=0;
        for(int i=0;i<size;i++){
            imp[i]=sc.next();
            totalLength+=imp[i].length();
        }
        System.out.println(totalLength);
        for(int j=0;j<size;j++){
            System.out.print(imp[j]+",");
        }
        
        System.out.println(reveString("Niranjan"));
    }

    static String reveString(String str){
        if (str==null || str.isEmpty()){
            return str;
        }
        return reveString(str.substring(1))+str.charAt(0);
    }

}

