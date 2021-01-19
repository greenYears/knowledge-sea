package org.meiqin.designmode.factory.pojo.aircondition;

import java.io.Serializable;

/**
 * 空调B
 * <p/>
 * AirconditionB
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class AirconditionB implements Aircondition, Serializable {
    private static final long serialVersionUID = 6579970234942614962L;

    public AirconditionB() {
        System.out.println("制造 ==>【空调B】");
    }
}
