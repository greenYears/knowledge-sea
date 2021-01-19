package org.meiqin.designmode.factory.methodfactory;

import org.meiqin.designmode.factory.pojo.car.GasBMW;

/**
 * 工厂方法.
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public interface IGasFactory {
    /**
     * 制造BMW.
     *
     * @return
     */
    GasBMW makeBMW();
}
