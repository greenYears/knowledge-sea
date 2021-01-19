package org.meiqin.designmode.singleton;

import lombok.Getter;
import lombok.Setter;
import sun.security.jca.GetInstance;

/**
 * 喇叭.
 * <p/>
 * Horn
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Getter
@Setter
public class Horn {
    private String content;

    private Horn() {
    }

    public void play() {
        System.out.println("【开始播报】:" + content);
    }

    static enum SingletonEnum {
        INSTANCE;
        private final Horn horn;

       private SingletonEnum() {
            this.horn = new Horn();
        }

        public Horn getInstance() {
            return horn;
        }
    }

    public static Horn getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

}
