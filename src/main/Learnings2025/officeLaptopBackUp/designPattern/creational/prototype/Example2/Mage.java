package designPattern.creational.prototype.Example2;

public class Mage {
    private String name;
    private int mana;
    private int intelligence;

    public Mage(String name, int mana, int intelligence) {
        this.name = name;
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Mage copy() {
        return new Mage(this.name, this.mana, this.intelligence);
    }
}
