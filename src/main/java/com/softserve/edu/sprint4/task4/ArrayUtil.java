package com.softserve.edu.sprint4.task4;


class ArrayUtil {
    public static  <T> T setAndReturn(T[] array, T el,  int index) {
        array[index] = el;
     return el;
    }
}
