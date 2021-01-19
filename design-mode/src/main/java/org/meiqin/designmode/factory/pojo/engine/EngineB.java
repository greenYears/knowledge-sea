package org.meiqin.designmode.factory.pojo.engine;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p/>
 * EngineB
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Data
@Accessors(chain = true)
public class EngineB implements Engine, Serializable {
    private static final long serialVersionUID = -7167394101763206083L;

    public EngineB() {
        System.out.println("制造 ==>【发动机B】");
    }
}
