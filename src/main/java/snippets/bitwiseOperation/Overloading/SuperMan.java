package snippets.bitwiseOperation.Overloading;

public class SuperMan extends Hero {
    @Override
    public String name() {
        return "SuperMan";
    }
    public Hero hero() {
        return new Hero();
    }
}
