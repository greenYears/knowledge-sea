package org.meiqin.designmode.command.light;

import lombok.extern.slf4j.Slf4j;

/**
 * 关灯命令.
 * <p/>
 * LightOffCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Slf4j
public class SwitchOffLightCommand extends LightCommand {

    public SwitchOffLightCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
