package org.meiqin.designmode.observer.weather.custom;

import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.observer.base.Subject;
import org.meiqin.designmode.observer.weather.WeatherInfo;

/**
 * 天成 天气.
 * <p/>
 * TCWeatherObserver
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
@Slf4j
public class TCWeatherObserver extends AbstractCompanyObserver {

    public TCWeatherObserver(Subject<WeatherInfo> subject) {
        super(subject);
        this.setCompany();
    }

    @Override
    void setCompany() {
        this.company = "天成天气";
    }

    @Override
    public void update(WeatherInfo info) {
        log.info("【{}】播报：", this.company);
        log.info("** \t当前天气：{}", info.getWeather());
    }
}
