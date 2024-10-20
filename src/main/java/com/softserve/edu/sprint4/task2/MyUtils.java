package com.softserve.edu.sprint4.task2;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyUtils {

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> common = new HashSet<>();

        for (Student s1 : list1) {
            for (Student s2 : list2) {
                if (s1.equals(s2)) {
                    common.add(s1);
                }
            }
        }
        return common;
    }

    public static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (! (o instanceof Student)) return false;
            if (this.name == null && ((Student) o).name == null) return true;
            Student student = (Student) o;
            return getId() == student.getId() && getName().equals(student.getName());
        }

        @Override
        public int hashCode() {
            int result = 31 * getId();
            return result + (result * result + getId());
        }


        @Override
        public int compareTo(Student o) {
            return this.name != null ? this.name.compareTo(o.name) : 0;
        }
    }

}
