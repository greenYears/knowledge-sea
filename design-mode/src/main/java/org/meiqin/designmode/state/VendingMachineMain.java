package org.meiqin.designmode.state;

/**
 * <p/>
 * VendingMachineMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(5);
        machine.insertCoin();
        machine.backCoin();

        System.out.println("-----------");

        machine.insertCoin();
        machine.turnCrank();

        System.out.println("----------压力测试-----");
        machine.insertCoin();
        machine.insertCoin();
        machine.turnCrank();
        machine.turnCrank();
        machine.backCoin();
        machine.turnCrank();
    }
}
