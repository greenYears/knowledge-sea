package org.meiqin.designmode.observer.weather.custom;

import lombok.extern.slf4j.Slf4j;
import org.meiqin.designmode.observer.base.Subject;
import org.meiqin.designmode.observer.weather.WeatherInfo;

/**
 * 仁德 天气.
 * <p/>
 * RDWeatherObserver
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
@Slf4j
public class RDWeatherObserver extends AbstractCompanyObserver {

    public RDWeatherObserver(Subject<WeatherInfo> subject) {
        super(subject);
        this.setCompany();
    }

    @Override
    void setCompany() {
        this.company = "仁德天气";
    }

    @Override
    public void update(WeatherInfo info) {
        log.info("【{}】播报：", this.company);
        log.info("** \t当前天气：{}", info.getWeather());
    }
}
