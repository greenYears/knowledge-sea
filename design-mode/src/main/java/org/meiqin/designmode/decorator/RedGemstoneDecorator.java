package org.meiqin.designmode.decorator;

/**
 * 黄宝石.
 * <p/>
 * RedGemstoneDecorator
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class RedGemstoneDecorator implements GemstoneDecorator {
    private Equipment equipment;

    public RedGemstoneDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public int attackNumber() {
        return 10 + equipment.attackNumber();
    }

    @Override
    public String description() {
        return equipment.description() + " + 红宝石";
    }
}
