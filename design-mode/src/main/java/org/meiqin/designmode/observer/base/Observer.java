package org.meiqin.designmode.observer.base;

/**
 * 观察者.
 * <p/>
 * 所有观察者均需要实现此接口.
 * Observer
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public interface Observer<T> {

    /**
     * 更新主题.天气
     *
     * @param t 信息
     */
    void update(T t);
}
