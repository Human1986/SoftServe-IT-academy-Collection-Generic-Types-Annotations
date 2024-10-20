package com.softserve.edu.sprint4.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {

    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        Map<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> phoneBook : phones.entrySet()) {
            String number = phoneBook.getKey();
            String name = phoneBook.getValue();

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(number);
        }
        return map;
    }
}