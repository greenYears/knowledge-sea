package org.meiqin.designmode.factory.methodfactory;

import org.meiqin.designmode.factory.pojo.car.BMW523;
import org.meiqin.designmode.factory.pojo.car.GasBMW;

/**
 * 宝马523.
 * <p/>
 * BMW523Factory
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class BMW523Factory implements IGasFactory {
    @Override
    public GasBMW makeBMW() {
        return new BMW523();
    }
}
