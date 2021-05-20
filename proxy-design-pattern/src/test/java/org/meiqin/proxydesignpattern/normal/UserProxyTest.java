package org.meiqin.proxydesignpattern.normal;

import org.junit.jupiter.api.Test;
import org.meiqin.proxydesignpattern.ProxyDesignPatternApplication;
import org.meiqin.proxydesignpattern.base.IUser;
import org.meiqin.proxydesignpattern.base.ManUser;

class UserProxyTest extends ProxyDesignPatternApplication {

    @Test
    void say() {
        IUser manUser = new ManUser();
        IUser userProxy = new UserProxy(manUser);
        userProxy.say();
    }
}