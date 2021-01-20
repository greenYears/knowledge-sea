package org.meiqin.designmode.facade;

/**
 * 家庭影院.
 * <p/>
 * HomeTheaterFacade
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class HomeTheaterFacade {
    private Audio audio;
    private Computer computer;

    public HomeTheaterFacade(Audio audio, Computer computer) {
        this.audio = audio;
        this.computer = computer;
    }

    public void beginWatch() {
        System.out.println("开始观看电影");
        computer.turnOn();
        audio.turnOn();
        audio.autoSound();
    }

    public void endWatch() {
        System.out.println("电影结束了");
        audio.turnOff();
        computer.turnOff();
    }
}
