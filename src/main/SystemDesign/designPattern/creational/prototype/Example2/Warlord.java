package designPattern.creational.prototype.Example2;

public class Warlord {
    private String name;
    private int strength;
    private int defense;

    public Warlord(String name, int strength, int defense) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
    }

    public Warlord copy() {
        return new Warlord(this.name, this.strength, this.defense);
    }
}
