package org.meiqin.designmode.bridge;

import org.meiqin.designmode.bridge.draw.DrawAPI;

import java.io.Serializable;

/**
 * <p/>
 * Circle
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class Circle extends Shape implements Serializable {
    private static final long serialVersionUID = 2960808513051376961L;
    private int x;
    private int y;
    private int radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.drawAPI.drawCircle(this.radius, this.x, this.y);
    }
}
