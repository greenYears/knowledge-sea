package org.meiqin.designmode.prototype.shape;

/**
 * <p/>
 * Circle
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class Circle extends Shape {
    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }


}
