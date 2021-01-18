package org.meiqin.designmode.observer.weather;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 天气.
 * <p/>
 * WeatherInfo
 *
 * @author zhoumeiqin
 * @date 2021/1/18
 */
@Data
@Accessors(chain = true)
public class WeatherInfo implements Serializable {
    private static final long serialVersionUID = -7661391743202589166L;
    /**
     * 天气.
     */
    private String weather;
}
