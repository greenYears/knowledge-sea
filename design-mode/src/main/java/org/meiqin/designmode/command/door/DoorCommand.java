package org.meiqin.designmode.command.door;

import org.meiqin.designmode.command.Command;

/**
 * 门的命令.
 * <p/>
 * AbstractDoorCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public abstract class DoorCommand implements Command {
    protected Door door;

    public DoorCommand(Door door) {
        this.door = door;
    }
}
