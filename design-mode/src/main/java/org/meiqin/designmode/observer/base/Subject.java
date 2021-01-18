package org.meiqin.designmode.observer.base;

/**
 * 主题.
 * <p/>
 * 所有主题均需要实现此接口.
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public interface Subject<T> {

    /**
     * 注册一个观察者.
     *
     * @param observer 观察者
     */
    void registerObserver(Observer<T> observer);

    /**
     * 移除一个观察者.
     *
     * @param observer 观察者
     */
    void removeObserver(Observer<T> observer);

    /**
     * 通知所有的观察者.
     */
    void notifyObserver();
}
