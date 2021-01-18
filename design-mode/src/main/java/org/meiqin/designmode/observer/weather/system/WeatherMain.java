package org.meiqin.designmode.observer.weather.system;

import org.meiqin.designmode.observer.weather.WeatherInfo;

import java.io.PipedOutputStream;
import java.sql.SQLOutput;
import java.util.Observable;
import java.util.Observer;

/**
 * <p/>
 * WeatherMain
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public class WeatherMain {
    public static void main(String[] args) {
        WeatherObservable observable = new WeatherObservable();
        TCWeatherObserver tcObserver = new TCWeatherObserver();
        RDWeatherObserver rdObserver = new RDWeatherObserver();
        tcObserver.registerObserver(observable);
        rdObserver.registerObserver(observable);
        WeatherInfo weatherInfo = new WeatherInfo().setWeather("阴转多云");
        observable.setWeatherInfo(weatherInfo);
    }
}
