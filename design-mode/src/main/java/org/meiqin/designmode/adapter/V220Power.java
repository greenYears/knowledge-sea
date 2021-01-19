package org.meiqin.designmode.adapter;

/**
 * 220电压.
 * <p/>
 * V220Power
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class V220Power {
    /**
     * 输出电压.
     *
     * @return
     */
    public int outputPower() {
        System.out.println("开始提供电流，当前电压220V...");
        return 220;
    }
}
