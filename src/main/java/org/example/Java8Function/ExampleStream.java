package org.example.Java8Function;


import javax.swing.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream extends Student {
    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("fore");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        //tạo 1 list
        //tìm các ptu có ký tự t
        //trả về list
        //Stream.collect()
        List<String> stream = numbers.stream()
                .filter( item -> item.startsWith("t") ) //lọc các ptu "t"
                .collect(Collectors.toList());
        System.out.println("List 1: 't' : " + stream);
        //số lần xuất hiệ của 't'
        //Stream.count()
        long countNum = numbers.stream()
                .filter(item -> item.startsWith("t"))
                .count();
        System.out.println("List 2: so luong  't' : " + countNum);

        //tạo 1 list
        //map các ptu vào và in hoa
        //trả về list
        List<String> mapped = numbers.stream()
                .map( item -> item.toUpperCase()) //In hoa các ptu
                .collect(Collectors.toList());
        System.out.println("List 3 : UpperCase: " + mapped);

        //Stream.reduce()
        String reduced = numbers.stream()
                .reduce((acc, item) -> acc + " " + item)
                .get();
        System.out.println("List 4 : reduce: " + reduced);
        // reduceds.forEach(System.out::println);

        // sử lý song song
        //Parallel Stream
        List<Integer> ints = new ArrayList<Integer>();
        Integer total = ints.parallelStream()
                .reduce(0, Integer::sum);

        List<org.example.Java8Function.Student> students = Arrays.asList(
                new org.example.Java8Function.Student(1, "Phan Thanh", 25),
                new org.example.Java8Function.Student(2, "My Duyen", 23),
                new org.example.Java8Function.Student(3, "Thanh Tuan", 20),
                new org.example.Java8Function.Student(4, "Bach Tho", 22),
                new org.example.Java8Function.Student(5, "Phan Phong", 24)
        );

        Map<Integer,Student> stu = students.stream()
                .collect(Collectors.toMap(org.example.Java8Function.Student::getId, Function.identity()));
        System.out.println(stu);

//        HashMap<Integer,Student> stu = new HashMap<>();
//        students.put(11, new Student("Bach Tho", 22););
//        students.put(11, new Student("Phan Thanh", 25));
//        students.put(12, new Student("Phan Phong", 24));
//        students.put(13, new Student("Thanh Tuan", 20));
//        students.put(14, new Student("Hoang long", 22));
//        students.put(15, new Student("My Duyen", 22));
//
//        Set<Integer> keySet = stu.keySet();
//        List<Integer> listStuSet = new ArrayList<Integer>(keySet);
//        System.out.println("key set : " +keySet);

//        Stream.iterate(1, count -> count + 1) //
//                .filter(number -> number % 3 == 0) //
//                .limit(3) //
//                .forEach(System.out::println);
    }

}
