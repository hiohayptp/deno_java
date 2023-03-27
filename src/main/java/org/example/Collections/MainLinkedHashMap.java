package org.example.Collections;

import java.util.LinkedHashMap;
import java.util.Set;

public class MainLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Student> st = new LinkedHashMap<>();

        st.put("20H40", new Student("Phong", 23));
        st.put("20H41", new Student("tho", 22));
        st.put("20H42", new Student("trung", 20));
        st.put("20H43", new Student("Thanh", 25));

        show(st);
        st.remove("20H42");
        System.out.println("danh sach la: " );
        show(st);

        System.out.println("In ra: ");
        st.get("20H41");

    }
        public static void show(LinkedHashMap<String, Student> st) {
            Set<String> keySet = st.keySet();
            for (String key : keySet) {
                System.out.println(key + " " + st.get(key));
            }
        }
}
