package com.softserve.edu.sprint4.task6;

import java.util.Arrays;
import java.util.Comparator;

enum Level {
    JUNIOR, MIDDLE, SENIOR
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}

class Developer extends Employee {
    private Level level;

    public Developer(String name, int age, double salary, Level level) {
        super(name, age, salary);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + ", Level: " + level.name();
    }
}

class Utility {
    public static <T extends Person> void sortPeople(T[] people, Comparator<? super T> comparator) {
        Arrays.sort(people, comparator);
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int compareName = person1.getName().compareTo(person2.getName());
        int compareAge = Integer.compare(person1.getAge(), person2.getAge());
        return compareName != 0 ? compareName : compareAge;
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int name = emp1.getName().compareTo(emp2.getName());
        if (name != 0) {
            return name;
        }
        int age = Integer.compare(emp1.getAge(), emp2.getAge());
        if (age != 0) {
            return age;
        }
        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}

class DeveloperComparator implements Comparator<Developer> {

    @Override
    public int compare(Developer developer1, Developer developer2) {
        int name = developer1.getName().compareTo(developer2.getName());
        if (name != 0) {
            return name;
        }
        int age = Integer.compare(developer1.getAge(), developer2.getAge());
        if (age != 0) {
            return age;
        }
        int salary = Double.compare(developer1.getSalary(), developer2.getSalary());
        if (salary != 0) {
            return salary;
        }
        return developer1.getLevel().compareTo(developer2.getLevel());
    }

}