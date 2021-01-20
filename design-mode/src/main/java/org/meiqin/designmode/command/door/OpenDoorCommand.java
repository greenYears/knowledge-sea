package org.meiqin.designmode.command.door;

/**
 * 开门
 * <p/>
 * OpenDoorCommand
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class OpenDoorCommand extends DoorCommand {
    public OpenDoorCommand(Door door) {
        super(door);
    }

    @Override
    public void execute() {
        door.open();
    }
}
