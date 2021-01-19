package org.meiqin.designmode.adapter;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 手机.
 * <p/>
 * Mobile
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Data
@Accessors(chain = true)
public class Mobile implements Serializable {
    private static final long serialVersionUID = -971689334684293672L;

    public void inputPower(PowerAdapter adapter) {
        int voltage = adapter.outputPower();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + voltage + "V");
    }
}
