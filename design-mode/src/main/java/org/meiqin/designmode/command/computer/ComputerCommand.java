package org.meiqin.designmode.command.computer;

import org.meiqin.designmode.command.Command;

/**
 * <p/>
 * ComputerCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public abstract class ComputerCommand implements Command {
    protected Computer computer;

    public ComputerCommand(Computer computer) {
        this.computer = computer;
    }
}
