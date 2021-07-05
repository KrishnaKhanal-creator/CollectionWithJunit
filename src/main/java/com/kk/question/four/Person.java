package com.kk.question.four;

public class Person {

    private Integer id;
    private String name;
    private Float salary;

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name, Float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
