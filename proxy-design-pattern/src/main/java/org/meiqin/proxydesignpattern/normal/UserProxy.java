package org.meiqin.proxydesignpattern.normal;

import org.meiqin.proxydesignpattern.base.IUser;

/**
 * User Proxy.
 * <p/>
 * UserProxy
 *
 * @author zichuan.zhou91@gmail.com
 * @date 2021/5/20
 */
public class UserProxy implements IUser {
    private IUser user;

    public UserProxy(IUser user) {
        this.user = user;
    }

    @Override
    public void say() {
        System.out.println("我是中介，我来代理：");
        if (user != null) {
            user.say();
        }

    }
}
