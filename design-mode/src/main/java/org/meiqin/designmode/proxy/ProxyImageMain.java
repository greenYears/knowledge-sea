package org.meiqin.designmode.proxy;

/**
 * <p/>
 * ProxyImageMain
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class ProxyImageMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test");
        // 图片需要从磁盘加载
        image.display();

        System.out.println("-------------------");

        // 图片不需要从磁盘加载
        image.display();
    }
}
