package org.meiqin.designmode.template;

/**
 * 工作者.
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public abstract class Worker {
    protected String name;

    public void oneDayWork() {
        entryCompany();
        working();
        exitCompany();
    }

    private void entryCompany() {
        System.out.println(name + "进入公司");
    }

    /**
     * 工作.
     */
    protected abstract void working();

    private void exitCompany() {
        System.out.println(name + "离开公司");
    }


}
