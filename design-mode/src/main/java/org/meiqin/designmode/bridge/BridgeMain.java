package org.meiqin.designmode.bridge;

import org.meiqin.designmode.bridge.draw.GreenCircle;
import org.meiqin.designmode.bridge.draw.RedCircle;

/**
 * <p/>
 * BridgeMain
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 1, 2, 3);
        Shape greenCircle = new Circle(new GreenCircle(), 2, 3, 4);
        redCircle.draw();
        greenCircle.draw();
    }
}
