package javaIntro.ListDemo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add(1,"E");
        System.out.println(names);

        names.set(2,"c");
        System.out.println(names);
        List subList = names.subList(2,3);
        System.out.println(subList);

        ListIterator<String> listIterator = names.listIterator();
        while(listIterator.hasNext()){
            String name = listIterator.next();
            System.out.print(name+" ");
        }
        System.out.println();
        while(listIterator.hasPrevious()){
            String name = listIterator.previous();
            System.out.print(name+" ");
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        names.sort(comparator);
        System.out.println(names);
        List namesCopy = new ArrayList(names);
        names.add("F");
        System.out.println(namesCopy);


        int[] a = {1,2,3};
        List aList = Arrays.asList(a);
        aList.get(0);
        System.out.println(aList.size());

    }
}
