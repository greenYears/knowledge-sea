package org.meiqin.designmode.singleton;

/**
 * <p/>
 * SingletonEnumMain
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class SingletonEnumMain {
    public static void main(String[] args) {
        Horn instance = Horn.getInstance();
        instance.setContent("快放假了！！！");
        instance.play();
        Horn instance1 = Horn.getInstance();
        System.out.println(instance == instance1);
    }
}
