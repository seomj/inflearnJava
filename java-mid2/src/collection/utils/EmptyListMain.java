package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new LinkedList<>();

        List<Object> list3 = Collections.emptyList(); // java 5
        List<Object> list4 = List.of(); // java 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

    }
}
