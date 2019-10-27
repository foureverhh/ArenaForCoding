package OOPIntro.recursionTest.demo02;

public class App {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = reverseString(str);
        System.out.println(reverse);
    }

    public static String reverseString(String str){
        if(str.isEmpty()){
            return "";
        }
       // System.out.println(str.charAt(0));
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
