package org.meiqin.designmode.bridge;

import org.meiqin.designmode.bridge.draw.DrawAPI;

/**
 * <p/>
 * Shape
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
