package org.meiqin.designmode.factory.methodfactory;

/**
 * <p/>
 * FactoryMethodMain
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        IGasFactory bmw320Factory = new BMW320Factory();
        bmw320Factory.makeBMW();
        IGasFactory bmw523Factory = new BMW523Factory();
        bmw523Factory.makeBMW();
    }
}
