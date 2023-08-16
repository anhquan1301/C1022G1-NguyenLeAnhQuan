package baitap.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInJava8 {
    public static void main(String[] args) {
        // REDUCE TRONG JAVA 8

//        List<Integer> numb = Arrays.asList(1,2,3,4,5);
//        int sum =  numb.stream().reduce(0,Integer::max);
//        System.out.println(sum);


//        List<Integer> numb = Arrays.asList(1,2,3,4,5);
//        int sum = 0;
//        for (int i = 0; i <numb.size(); i++) {
//            sum += numb.get(i);
//        }
//        System.out.println(sum);

        // FILTER
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> evenNum = numbers.parallelStream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println("Số lẻ: " + evenNum);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> evenNum = new ArrayList<>();
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                evenNum.add(number);
//            }
//        }
//        System.out.println("Số lẻ: " + evenNum);
//     OPTIONAL
//        String name = null;
//        Optional<String> optionalName = Optional.ofNullable(name);
//        optionalName.orElse("");

    }
}
