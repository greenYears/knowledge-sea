package org.meiqin.designmode.factory.pojo.aircondition;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 空调A
 * <p/>
 * AirconditionA
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Data
@Accessors(chain = true)
public class AirconditionA implements Aircondition, Serializable {
    private static final long serialVersionUID = -1918944354031879533L;

    public AirconditionA() {
        System.out.println("制造 ==>【空调A】");
    }
}
