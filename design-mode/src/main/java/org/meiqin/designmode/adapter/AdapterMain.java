package org.meiqin.designmode.adapter;

/**
 * <p/>
 * AdapterMain
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
public class AdapterMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V220Power v220Power = new V220Power();
        V5MobilePower mobilePower = new V5MobilePower(v220Power);
        mobile.inputPower(mobilePower);
    }
}
