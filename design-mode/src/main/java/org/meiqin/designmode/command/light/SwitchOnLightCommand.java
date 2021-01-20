package org.meiqin.designmode.command.light;

/**
 * 开灯命令.
 * <p/>
 * LightOnCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class SwitchOnLightCommand extends LightCommand {
    public SwitchOnLightCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
