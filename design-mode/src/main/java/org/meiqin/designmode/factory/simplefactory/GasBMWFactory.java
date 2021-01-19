package org.meiqin.designmode.factory.simplefactory;

import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.factory.pojo.car.BMW320;
import org.meiqin.designmode.factory.pojo.car.BMW523;
import org.meiqin.designmode.factory.pojo.car.GasBMW;

/**
 * 汽油车宝马工厂.
 * <p/>
 * GasBMWFactory
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Slf4j
public class GasBMWFactory {

    public GasBMW makeBMW(String type) {
        switch (type) {
            case "320":
                return new BMW320();
            case "523":
                return new BMW523();
            default:
                throw new RuntimeException("未知的宝马型号");
        }
    }
}
