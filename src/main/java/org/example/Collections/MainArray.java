package org.example.Collections;

import java.util.*;


public class MainArray {
    public static void main(String[] args) {

        // Set dạng value
        Set<Student> set = new HashSet<>();
        // các ptu duy nhất, lưu trữ có chế băm (hashTable), k duy trì thứ tự chèn
        TreeSet<Student> treeSet = new TreeSet<>();
        // các ptu duy nhất, duy trì thứ tự chèn
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        // các ptu duy nhất, cho phép null, duy trì thứ tự chèn

        // Map dạng Key/value
        Map<Integer,Student> map = new HashMap<>();
        //các key là duy nhất, có thể có 1 key null và nhìu giá trị null, k theo thứ tự
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //các key là duy nhất, theo thứ tự chèn, k cho phép key null
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        //các key là duy nhất, duy trì theo thứ tự key tăng dần, có thể có 1 key null và nhìu giá trị null

        List<Integer> list = new ArrayList<>();
        // lưu dưới dạng mảng
        LinkedList<Integer> linkedList = new LinkedList<>();
        // lưu dưới dạng danh sách liên kết
    }

    public Integer toString(Integer b) {
        return null;
    }
}
