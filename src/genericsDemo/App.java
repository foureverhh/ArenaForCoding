package genericsDemo;

public class App {
    public static void main(String[] args) {

    String str1 = new String("A");
    String str2 = new String("B");
    OwnComparator comparator = new OwnComparator();
    int result = comparator.whichIsBigger(str1,str2);
    System.out.println(result);

    int a = 1;
    int b = 2;
    comparator.whichIsBigger(1,2);
        System.out.println(result);
    }

}
