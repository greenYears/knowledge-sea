package org.meiqin.designmode.prototype;

import org.meiqin.designmode.prototype.shape.Circle;
import org.meiqin.designmode.prototype.shape.Rectangle;
import org.meiqin.designmode.prototype.shape.Shape;
import org.meiqin.designmode.prototype.shape.Square;

import java.util.Hashtable;

/**
 * <p/>
 * ShapeCache
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        try {
            return (Shape) shape.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("未找到对应的Shape");
        }
    }

    public static void load() {
        Circle circle = new Circle();
        circle.setId("1").setDescription("这是一个圆形");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2").setDescription("这是一个正方形");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3").setDescription("这是一个长方形");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
