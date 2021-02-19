package org.meiqin.designmode.iterator;

/**
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public interface Container {
    /**
     * 获取迭代.
     *
     * @return
     */
    Iterator getIterator();
}
