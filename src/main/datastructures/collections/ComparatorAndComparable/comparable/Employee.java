package collections.ComparatorAndComparable.comparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer age;

    public Employee(String name, int age) {
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
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age); // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
