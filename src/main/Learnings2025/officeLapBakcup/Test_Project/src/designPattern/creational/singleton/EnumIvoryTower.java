package designPattern.creational.singleton;

public enum EnumIvoryTower {
    INSTANCE;

    private int residents;

    EnumIvoryTower() {
        this.residents = 0;
    }

    public void enter() {
        residents++;
    }

    public void leave() {
        if (residents > 0) {
            residents--;
        }
    }

    public int getResidents() {
        return residents;
    }

    @Override
    public String toString() {
        return "Ivory Tower with " + residents + " residents.";
    }
}
