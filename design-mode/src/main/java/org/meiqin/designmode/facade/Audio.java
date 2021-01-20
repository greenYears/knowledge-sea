package org.meiqin.designmode.facade;

/**
 * 音响.
 * <p/>
 * Audio
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class Audio {
    public void turnOn() {
        System.out.println("【音响】打开");
    }

    public void turnOff() {
        System.out.println("【音响】关闭");
    }

    public void autoSound() {
        System.out.println("【音响】自动调整音量大小");
    }
}
