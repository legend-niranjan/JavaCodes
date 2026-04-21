package berribot;

public class FindPrimeInArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,9,10};
        for (int i: arr){
            if(isPrime(i)) System.out.print(i+" ");
        }
    }

    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
