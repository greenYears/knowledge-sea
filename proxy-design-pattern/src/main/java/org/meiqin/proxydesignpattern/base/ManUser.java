package org.meiqin.proxydesignpattern.base;

/**
 * Man User.
 * <p/>
 * ManUser
 *
 * @author zichuan.zhou91@gmail.com
 * @date 2021/5/20
 */
public class ManUser implements IUser {
    @Override
    public void say() {
        System.out.println("我是男人！！！");
    }
}
