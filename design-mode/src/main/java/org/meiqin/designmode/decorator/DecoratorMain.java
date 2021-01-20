package org.meiqin.designmode.decorator;

/**
 * <p/>
 * DecoratorMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("一个镶嵌了2颗蓝宝石+1颗红宝石的屠龙刀");
        BlueGemstoneDecorator decorator = new BlueGemstoneDecorator(new BlueGemstoneDecorator(new RedGemstoneDecorator(new ArmEquipment())));
        System.out.println("装备描述：" + decorator.description());
        System.out.println("攻击力：  "+ decorator.attackNumber());
    }
}
