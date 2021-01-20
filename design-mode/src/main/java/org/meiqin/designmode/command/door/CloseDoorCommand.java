package org.meiqin.designmode.command.door;

/**
 * 关门.
 * <p/>
 * CloseDoorCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class CloseDoorCommand extends DoorCommand {

    public CloseDoorCommand(Door door) {
        super(door);
    }

    @Override
    public void execute() {
        door.close();
    }
}
