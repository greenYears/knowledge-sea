package org.meiqin.designmode.decorator;

/**
 * 戒指.
 * <p/>
 * RingEquipment
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class RingEquipment implements Equipment {
    @Override
    public int attackNumber() {
        return 5;
    }

    @Override
    public String description() {
        return "麻痹戒指";
    }
}
