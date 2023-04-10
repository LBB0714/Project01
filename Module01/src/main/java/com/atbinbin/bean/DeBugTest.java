package com.atbinbin.bean;

import java.util.HashMap;

/**
 * @author LBB
 * @create 2023-04-10 16:44
 */
public class DeBugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map =  new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","TsingHua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println(age);

        map.remove("major");
        System.out.println(map);
    }

}
