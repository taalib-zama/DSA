package Collections;

public class Person {
    private String name;
    private int age;

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
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public boolean compareTo(Person person2) {
        if (this.age > person2.age) {
            return true; // this person is older
        } else if (this.age < person2.age) {
            return false; // this person is younger
        } else {
            return false; // same age
        }
    }
}
