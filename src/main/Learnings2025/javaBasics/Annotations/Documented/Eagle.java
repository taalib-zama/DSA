package javaBasics.Annotations.Documented;

public class Eagle implements Bird {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean canFly(String fly) {
        return false;
    }
}
