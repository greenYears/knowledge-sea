package org.meiqin.designmode.factory.pojo.engine;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p/>
 * EngineA
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Data
@Accessors(chain = true)
public class EngineA implements Engine, Serializable {
    private static final long serialVersionUID = -2290280937744877341L;

    public EngineA() {
        System.out.println("制造 ==>【发动机A】");
    }
}
