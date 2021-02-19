package org.meiqin.designmode.bridge.draw;

/**
 * <p/>
 * GreenCircle
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画了个绿色的，坐标[" + x + "," + y + "]，半径的" + radius + "圆形");
    }
}
