package org.meiqin.designmode.state;

/**
 * 自动售货机.
 * <p/>
 * VendingMachine
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class VendingMachine {
    /**
     * 未投币.
     */
    public static final int NO_COIN = 0;

    /**
     * 已投币.
     */
    public static final int HAS_COIN = 1;

    /**
     * 出售中.
     */
    public static final int SOLDING = 2;

    /**
     * 商品售罄.
     */
    public static final int EMPTY = 3;

    private int currentStatus = NO_COIN;

    private int count = 0;

    public VendingMachine(int count) {
        this.count = count;
        if (count > 0) {
            currentStatus = NO_COIN;
        } else {
            currentStatus = EMPTY;
        }
    }

    public void insertCoin() {
        switch (currentStatus) {
            case NO_COIN:
                currentStatus = HAS_COIN;
                System.out.println("投币成功");
                break;
            case HAS_COIN:
                System.out.println("当前已投币，请勿重复投币");
                break;
            case SOLDING:
                System.out.println("正在出货中，请勿投币");
                break;
            case EMPTY:
                System.out.println("商品已售罄，请勿投币");
                break;
        }
    }

    public void backCoin() {
        switch (currentStatus) {
            case NO_COIN:
            case EMPTY:
                System.out.println("当前未投币");
                break;
            case HAS_COIN:
                currentStatus = NO_COIN;
                System.out.println("退币成功");
                break;
            case SOLDING:
                System.out.println("当前正在出货中，无法退币");
                break;
        }
    }

    public void turnCrank() {
        switch (currentStatus) {
            case NO_COIN:
                System.out.println("您未投币，请先投币");
                break;
            case HAS_COIN:
                System.out.println("准备出货...");
                currentStatus = SOLDING;
                dispense();
                break;
            case SOLDING:
                System.out.println("正在出货中，多次摇杆无效");
                break;
            case EMPTY:
                System.out.println("商品已售罄");
        }
    }

    private void dispense() {
        switch (currentStatus) {
            case NO_COIN:
            case HAS_COIN:
            case EMPTY:
                throw new RuntimeException("非法状态...");
            case SOLDING:
                count--;
                System.out.println("发放商品");
                if (count == 0) {
                    System.out.println("商品售罄");
                    currentStatus = EMPTY;
                }  else {
                    currentStatus = NO_COIN;
                }
                break;
        }
    }
}
