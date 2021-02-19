package org.meiqin.designmode.iterator;

/**
 * <p/>
 * ContainerMain
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class ContainerMain {
    public static void main(String[] args) {
        Container container = new NameRepository();
        final Iterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            final String next = (String) iterator.next();
            System.out.println(next);
        }
    }
}
