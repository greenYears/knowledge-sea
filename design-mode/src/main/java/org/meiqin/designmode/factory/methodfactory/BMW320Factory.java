package org.meiqin.designmode.factory.methodfactory;

import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.factory.pojo.car.BMW320;
import org.meiqin.designmode.factory.pojo.car.GasBMW;

/**
 * 宝马320工厂.
 * <p/>
 * BMW320Factory
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Slf4j
public class BMW320Factory implements IGasFactory {
    @Override
    public GasBMW makeBMW() {
        return new BMW320();
    }
}
