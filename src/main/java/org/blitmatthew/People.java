package org.blitmatthew;

public class People {
    private final String name;
    private Integer age;
    private static Integer count = 0;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Integer getCount() {
        return count;
    }

    private static void setCount(Integer count) {
        People.count = count;
    }
}
