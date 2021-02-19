package org.meiqin.designmode.iterator;

/**
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public interface Iterator {
    /**
     * 是否有下一个.
     *
     * @return
     */
    boolean hasNext();

    /**
     * 下一个元素.
     *
     * @return
     */
    Object next();
}
