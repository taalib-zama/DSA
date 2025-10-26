package designPattern.creational.prototype.Example2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory {

    private final Mage mage;
    private final Warlord warlord;
    private final Beast beast;

    public Mage createMage() {
        return mage.copy();
    }

    public Warlord createWarlord() {
        return warlord.copy();
    }

    public Beast createBeast() {
        return beast.copy();
    }

}
