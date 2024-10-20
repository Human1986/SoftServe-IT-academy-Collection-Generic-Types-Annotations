package com.softserve.edu.sprint4.task3;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MyUtils {

    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        if (list.isEmpty() && map.isEmpty()) return true;
        int count = 0;
        for (String s : list) {
            for (String value : map.values()) {
                if (s == null) return true;
                if (s.equals(value)) count++;
            }
          if (count == map.size() ) return true;
        }
        return false;

    }
}