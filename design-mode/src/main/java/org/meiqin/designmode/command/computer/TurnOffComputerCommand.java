package org.meiqin.designmode.command.computer;

/**
 * 关电脑.
 * <p/>
 * TurnOffComputerCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class TurnOffComputerCommand extends ComputerCommand {
    public TurnOffComputerCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}
