package org.meiqin.designmode.observer.weather.system;

import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.observer.weather.WeatherInfo;

import java.util.Observable;
import java.util.Observer;

/**
 * 天成.
 * <p/>
 * TCWeatherObserver
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
@Slf4j
public class TCWeatherObserver implements Observer {

    public void registerObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        log.info("【天成播报】:");
        WeatherObservable observable = (WeatherObservable) o;
        WeatherInfo weatherInfo = observable.getWeatherInfo();
        if (weatherInfo != null) {
            log.info("当前天气：{}", weatherInfo.getWeather());
        }
    }
}
