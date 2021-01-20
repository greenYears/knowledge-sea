package org.meiqin.designmode.command;

import java.util.List;

/**
 * 快捷命令.
 * <p/>
 * QuickCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class QuickCommand implements Command {
    private List<Command> commands;

    public QuickCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        if (commands != null) {
            commands.forEach(Command::execute);
        }
    }
}
