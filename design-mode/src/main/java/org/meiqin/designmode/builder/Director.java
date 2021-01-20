package org.meiqin.designmode.builder;

/**
 * <p/>
 * Director
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class Director {
    public Product create(Builder<Product> builder) {
        return builder.itemA().itemB().itemC().itemD().build();
    }
}
