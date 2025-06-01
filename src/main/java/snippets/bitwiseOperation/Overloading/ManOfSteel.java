package snippets.bitwiseOperation.Overloading;

public class ManOfSteel extends SuperMan {
    @Override
    public String name() {
        return "超级超级英雄";
    }

    @Override
    public SuperMan hero() {
        return new SuperMan();
    }

}
