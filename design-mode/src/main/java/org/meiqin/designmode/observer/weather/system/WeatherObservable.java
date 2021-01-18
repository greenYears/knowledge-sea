package org.meiqin.designmode.observer.weather.system;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.meiqin.designmode.observer.weather.WeatherInfo;

import java.util.Observable;

/**
 * 天气主题.
 * <p/>
 * WeatherObservable
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public class WeatherObservable extends Observable {
    /**
     * 天气信息.
     */
    private WeatherInfo weatherInfo;

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        setChanged();
        notifyObservers();
    }
}
