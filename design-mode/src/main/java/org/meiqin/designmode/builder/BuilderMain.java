package org.meiqin.designmode.builder;

/**
 * <p/>
 * BuilderMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class BuilderMain {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director();
        Product product = director.create(builder);
        System.out.println(product);
    }
}
