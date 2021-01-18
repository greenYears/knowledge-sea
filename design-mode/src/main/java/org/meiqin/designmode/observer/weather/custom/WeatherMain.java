package org.meiqin.designmode.observer.weather.custom;

import org.meiqin.designmode.observer.weather.WeatherInfo;

/**
 * <p/>
 * WeatherMain
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
public class WeatherMain {

    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setWeather("晴天");
        WeatherSubject subject = new WeatherSubject();
        RDWeatherObserver rdWeatherObserver = new RDWeatherObserver(subject);
        TCWeatherObserver tcWeatherObserver = new TCWeatherObserver(subject);
        subject.updateWeather(weatherInfo);
    }
}
