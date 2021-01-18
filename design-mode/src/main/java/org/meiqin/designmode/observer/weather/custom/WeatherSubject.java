package org.meiqin.designmode.observer.weather.custom;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.observer.base.Observer;
import org.meiqin.designmode.observer.base.Subject;
import org.meiqin.designmode.observer.weather.WeatherInfo;

import java.util.List;

/**
 * 天气预报.
 * <p/>
 * WeatherSubject
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
@Slf4j
public class WeatherSubject implements Subject<WeatherInfo> {
    /**
     * 观察者.
     */
    private List<Observer<WeatherInfo>> observers = Lists.newArrayList();

    private WeatherInfo weatherInfo;

    @Override
    public void registerObserver(Observer<WeatherInfo> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<WeatherInfo> observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(target -> target.update(weatherInfo));
    }

    /**
     * 更新天气.
     *
     * @param weatherInfo 天气信息
     */
    public void updateWeather(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        notifyObserver();
    }
}
