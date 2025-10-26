package test;

public class Person {
    String name;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer age;

    public Object getAge() {
        return age;
    }
}
