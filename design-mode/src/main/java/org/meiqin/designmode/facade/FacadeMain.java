package org.meiqin.designmode.facade;

/**
 * <p/>
 * FacadeMain
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class FacadeMain {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Computer computer = new Computer();
        HomeTheaterFacade facade = new HomeTheaterFacade(audio, computer);
        facade.beginWatch();
        System.out.println("过了很久很久");
        facade.endWatch();
    }
}
