package org.meiqin.designmode.factory.abstractfactory;

/**
 * <p/>
 * GasFactoryMain
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class GasFactoryMain {
    public static void main(String[] args) {
        IGasFactory bmw320Factory = new BMW320Factory();
        bmw320Factory.makeEngine();
        bmw320Factory.makeAircondition();

        IGasFactory bmw523Factory = new BMW523Factory();
        bmw523Factory.makeEngine();
        bmw523Factory.makeAircondition();
    }
}
