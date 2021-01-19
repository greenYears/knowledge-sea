package org.meiqin.designmode.factory.simplefactory;

import org.meiqin.designmode.factory.pojo.car.GasBMW;

/**
 * <p/>
 * GasBMWFactoryMain
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class GasBMWFactoryMain {
    public static void main(String[] args) {
        GasBMWFactory factory = new GasBMWFactory();
        GasBMW bmw523 = factory.makeBMW("523");
        GasBMW bmw320 = factory.makeBMW("320");
    }
}
