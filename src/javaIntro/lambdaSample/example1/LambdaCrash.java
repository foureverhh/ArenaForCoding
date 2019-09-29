package javaIntro.lambdaSample.example1;

public class LambdaCrash {
    public static void main(String[] args) {
        /*
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(stringComparator.compare("hello","world"));

        Comparator<String> stringComparatorLambda = (String o1, String o2)->{return o1.compareTo(o2);};
        //(o1,o2)->{return o1.compareTo(o2)}
        //(o1,o2)->o1.compareTo(o2);
        System.out.println(stringComparatorLambda.compare("hello","world"));
        */
        MyFunction myFunction = (text1,text2) -> "Hello World" + text1+" "+text2;

        String result = myFunction.apply(" text1","text2");
        System.out.println(result);
    }

}
