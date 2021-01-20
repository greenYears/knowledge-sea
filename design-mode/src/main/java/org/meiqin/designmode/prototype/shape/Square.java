package org.meiqin.designmode.prototype.shape;

/**
 * <p/>
 * Square
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class Square extends Shape {
    public Square() {
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
