package org.meiqin.designmode.factory.abstractfactory;

import org.meiqin.designmode.factory.pojo.aircondition.Aircondition;
import org.meiqin.designmode.factory.pojo.aircondition.AirconditionA;
import org.meiqin.designmode.factory.pojo.engine.Engine;
import org.meiqin.designmode.factory.pojo.engine.EngineA;

/**
 * 宝马320.
 * <p/>
 * BMW320Factory
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class BMW320Factory implements IGasFactory{
    @Override
    public Engine makeEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition makeAircondition() {
        return new AirconditionA();
    }
}
