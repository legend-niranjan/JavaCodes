package berribot;

public class FindMaxLengthWordFromString {
    public static void main(String[] args) {
        String str="Niranjan Rajkumar Suryawanshi";
        System.out.println(getMaxWord(str));
    }

    public static String getMaxWord(String str){
        String strArr[]=str.split(" ");
        String maxWord="";

        for(String word: strArr){
            if(word.length()>maxWord.length()){
                maxWord=word;
            }
        }
        return maxWord;
    }
}
