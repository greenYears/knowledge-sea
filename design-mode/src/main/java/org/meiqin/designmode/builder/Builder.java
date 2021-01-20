package org.meiqin.designmode.builder;

/**
 * Builder.
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public interface Builder<T> {
    Builder<T> itemA();

    Builder<T> itemB();

    Builder<T> itemC();

    Builder<T> itemD();

    T build();
}
