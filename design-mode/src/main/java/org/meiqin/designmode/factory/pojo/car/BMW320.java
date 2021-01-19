package org.meiqin.designmode.factory.pojo.car;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 宝马320.
 * <p/>
 * BMW320
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BMW320 extends GasBMW implements Serializable {
    private static final long serialVersionUID = -8693192437877596590L;

    public BMW320() {
        System.out.println("制造 ==> [宝马320]");
    }
}
