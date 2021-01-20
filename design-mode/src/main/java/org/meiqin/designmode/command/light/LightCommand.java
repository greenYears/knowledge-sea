package org.meiqin.designmode.command.light;

import org.meiqin.designmode.command.Command;
import org.meiqin.designmode.command.light.Light;

/**
 * 电灯命令.
 * <p/>
 * AbstractLightCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public abstract class LightCommand implements Command {
    protected Light light;

    public LightCommand(Light light) {
        this.light = light;
    }
}
