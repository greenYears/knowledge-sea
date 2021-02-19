package org.meiqin.designmode.mediator;

/**
 * <p/>
 * ChatRoomMain
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class ChatRoomMain {
    public static void main(String[] args) {
        User zhangsan = new User("张三");
        User lisi = new User("李四");
        zhangsan.sendMessage("您好，我是张三");
        lisi.sendMessage("你好，我是李四");
    }
}
