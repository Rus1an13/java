package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        int[] nums = {-3, 5, 0, 4, 8, -4, -1, 2};
//        int count = 0;
//
//        for (int i : nums)
//            if(i > 0)
//                count += i;

//        long count = IntStream.of(nums).filter(w -> w > 0).count();
//            System.out.println(count);

//        IntStream.of(nums).filter(w -> w > 0 && w < 6).forEach(System.out::println);

//        IntStream.of(50, 40, 30, 20, 10, 0).filter(w -> w <= 40 && w >= 10).map(w -> w + 15).limit(3).forEach(System.out::println);

//        List<String> list = new ArrayList<>();
//
//        list.add("         Hel    lo   ");
//        list.add("    Me       ");
//        list.add("        You      ");
//        list.add("     They    ");
//
//        Stream<String> stream = list.stream();
//        stream.filter(w -> w.trim().length() == 3).forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Bob");
        names.add("Jone");
        names.add("Ivan");

        Stream<String> stream = names.stream();
        stream.filter(w -> !w.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    }
}
