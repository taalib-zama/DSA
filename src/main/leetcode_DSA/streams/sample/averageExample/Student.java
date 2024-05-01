package streams.sample.averageExample;




public class Student {
    int roll;
    int marks;
    String name;

    Student(int r, String n, int m)
    {
        roll = r;
        name = n;
        marks = m;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
