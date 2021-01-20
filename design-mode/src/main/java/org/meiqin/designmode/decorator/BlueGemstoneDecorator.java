package org.meiqin.designmode.decorator;

/**
 * 蓝宝石.
 * <p/>
 * BlueGemstoneDecorator
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class BlueGemstoneDecorator implements GemstoneDecorator {
    private Equipment equipment;

    public BlueGemstoneDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public int attackNumber() {
        return 5 + equipment.attackNumber();
    }

    @Override
    public String description() {
        return equipment.description() + " + 蓝宝石";
    }
}
