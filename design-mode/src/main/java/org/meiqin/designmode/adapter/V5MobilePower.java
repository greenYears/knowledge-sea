package org.meiqin.designmode.adapter;

/**
 * 5V手机充电器适配器.
 * <p/>
 * V5MobilePower
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class V5MobilePower implements PowerAdapter {
    private V220Power power;

    public V5MobilePower(V220Power power) {
        this.power = power;
    }

    @Override
    public int outputPower() {
        if (power == null) {
            throw new RuntimeException("请检查是否接通电源");
        }
        int i = power.outputPower();
        if (i > 5) {
            System.out.println("开始进行降压流程，将电压控制在5V");
        }
        return 5;
    }
}
