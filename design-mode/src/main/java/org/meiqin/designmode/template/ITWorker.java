package org.meiqin.designmode.template;

/**
 * 程序猿.
 * <p/>
 * ITWorker
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class ITWorker extends Worker {
    public ITWorker(String name) {
        this.name = name;
    }

    @Override
    protected void working() {
        System.out.println(name + "开发，写bug，解决bug");
    }
}
