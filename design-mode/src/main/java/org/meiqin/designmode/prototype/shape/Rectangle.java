package org.meiqin.designmode.prototype.shape;

/**
 * <p/>
 * Rectangle
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

