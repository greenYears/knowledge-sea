package org.meiqin.designmode.factory.abstractfactory;

import org.meiqin.designmode.factory.pojo.aircondition.Aircondition;
import org.meiqin.designmode.factory.pojo.engine.Engine;

/**
 * 燃油车.
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public interface IGasFactory {
    /**
     * 制造发动机.
     *
     * @return
     */
    Engine makeEngine();

    /**
     * 制造空调.
     *
     * @return
     */
    Aircondition makeAircondition();
}
