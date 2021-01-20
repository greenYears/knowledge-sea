package org.meiqin.designmode.command;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制面板.
 * <p/>
 * ControlPanel
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 9;
    private List<Command> commands;

    public ControlPanel() {
        commands = new ArrayList<>(CONTROL_SIZE);
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands.add(i, new EmptyCommand());
        }
    }

    public void setCommand(int index, Command command) {
        commands.set(index, command);
    }

    public void pressButton(int index) {
        Command command = commands.get(index);
        command.execute();
    }
}
