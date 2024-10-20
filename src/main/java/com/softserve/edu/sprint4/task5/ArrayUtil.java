package com.softserve.edu.sprint4.task5;

class Array<T> {
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
}

class ArrayUtil {
    public static <T extends Number> double averageValue(Array<T> array) {
        double sum = 0.0;
        int length = array.length();

        for (int i = 0; i < length; i++) {
            sum += array.get(i).doubleValue();
        }

        return length == 0 ? 0.0 : sum / length;

    }
}