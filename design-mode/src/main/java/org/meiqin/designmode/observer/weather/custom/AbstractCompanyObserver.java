package org.meiqin.designmode.observer.weather.custom;

import org.meiqin.designmode.observer.base.Observer;
import org.meiqin.designmode.observer.base.Subject;
import org.meiqin.designmode.observer.weather.WeatherInfo;

/**
 * 合作公司天气播报.
 * <p/>
 * AbstractCompanyObserver
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public abstract class AbstractCompanyObserver implements Observer<WeatherInfo> {
    /**
     * 天气信息.
     */
    protected Subject<WeatherInfo> subject;
    /**
     * 公司名称.
     */
    protected String company;

    public AbstractCompanyObserver(Subject<WeatherInfo> subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * 设置公司.
     */
    abstract void setCompany();
}
