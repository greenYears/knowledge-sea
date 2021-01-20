package org.meiqin.designmode.decorator;

/**
 * 装备.
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public interface Equipment {

    /**
     * 攻击力.
     *
     * @return
     */
    int attackNumber();

    /**
     * 装备描述.
     *
     * @return
     */
    String description();
}
