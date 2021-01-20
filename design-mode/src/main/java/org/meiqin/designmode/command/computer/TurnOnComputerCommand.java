package org.meiqin.designmode.command.computer;

/**
 * 打开电脑.
 * <p/>
 * OpenComputerCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class TurnOnComputerCommand extends ComputerCommand{
    public TurnOnComputerCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
