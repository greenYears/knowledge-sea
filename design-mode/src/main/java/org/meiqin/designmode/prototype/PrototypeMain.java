package org.meiqin.designmode.prototype;

import org.meiqin.designmode.prototype.shape.Shape;

/**
 * <p/>
 * PrototypeMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCache.load();
        System.out.println("获取index=1的Shape");
        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape :" + shape.getType());
        shape.draw();

        System.out.println("获取index=1的Shape");
        Shape shape_1 = ShapeCache.getShape("1");
        System.out.println("Shape :" + shape_1.getType());
        shape_1.draw();
        System.out.println(shape == shape_1);

        System.out.println("获取index=2的Shape");
        shape = ShapeCache.getShape("2");
        System.out.println("Shape :" + shape.getType());
        shape.draw();

        System.out.println("获取index=3的Shape");
        shape = ShapeCache.getShape("3");
        System.out.println("Shape :" + shape.getType());
        shape.draw();

    }
}
