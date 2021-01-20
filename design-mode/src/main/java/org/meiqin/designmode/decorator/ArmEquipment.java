package org.meiqin.designmode.decorator;

/**
 * 武器.
 * <p/>
 * ArmEquipment
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class ArmEquipment implements Equipment {
    @Override
    public int attackNumber() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
