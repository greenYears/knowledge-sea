package org.meiqin.designmode.factory.abstractfactory;

import org.meiqin.designmode.factory.pojo.aircondition.Aircondition;
import org.meiqin.designmode.factory.pojo.aircondition.AirconditionB;
import org.meiqin.designmode.factory.pojo.engine.Engine;
import org.meiqin.designmode.factory.pojo.engine.EngineB;

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
    public Engine makeEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition makeAircondition() {
        return new AirconditionB();
    }
}
