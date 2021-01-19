package org.meiqin.designmode.factory.pojo.car;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 宝马523.
 * <p/>
 * BMW523
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BMW523 extends GasBMW implements Serializable {
    private static final long serialVersionUID = 5110708967817609710L;

    public BMW523() {
        System.out.println("制造 ==> [宝马523]");
    }
}
