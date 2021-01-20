package org.meiqin.designmode.command;

import com.google.common.collect.Lists;
import org.meiqin.designmode.command.computer.Computer;
import org.meiqin.designmode.command.computer.TurnOffComputerCommand;
import org.meiqin.designmode.command.computer.TurnOnComputerCommand;
import org.meiqin.designmode.command.door.CloseDoorCommand;
import org.meiqin.designmode.command.door.Door;
import org.meiqin.designmode.command.door.OpenDoorCommand;
import org.meiqin.designmode.command.light.Light;
import org.meiqin.designmode.command.light.SwitchOffLightCommand;
import org.meiqin.designmode.command.light.SwitchOnLightCommand;

/**
 * <p/>
 * CommandMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class CommandMain {
    public static void main(String[] args) {
        /**
         * 三个家电
         */
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();
        ControlPanel controlPanel = new ControlPanel();
        // 灯的命令.
        controlPanel.setCommand(0, new SwitchOnLightCommand(light));
        controlPanel.setCommand(1, new SwitchOffLightCommand(light));
        // 门的命令.
        controlPanel.setCommand(2, new OpenDoorCommand(door));
        controlPanel.setCommand(3, new CloseDoorCommand(door));
        // 电脑的命令.
        controlPanel.setCommand(4, new TurnOnComputerCommand(computer));
        controlPanel.setCommand(5, new TurnOffComputerCommand(computer));

        // 模拟点击
        controlPanel.pressButton(0);
        controlPanel.pressButton(2);
        controlPanel.pressButton(3);
        controlPanel.pressButton(4);
        controlPanel.pressButton(5);
        // 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳
        controlPanel.pressButton(8);

        System.out.println("******快捷命令******");
        QuickCommand quickCommand = new QuickCommand(Lists.newArrayList(new OpenDoorCommand(door), new SwitchOffLightCommand(light), new TurnOnComputerCommand(computer)));
        controlPanel.setCommand(8, quickCommand);
        controlPanel.pressButton(8);

    }
}
