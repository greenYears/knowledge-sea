package org.meiqin.proxydesignpattern.jdk;

import org.junit.jupiter.api.Test;
import org.meiqin.proxydesignpattern.ProxyDesignPatternApplication;
import org.meiqin.proxydesignpattern.base.IUser;
import org.meiqin.proxydesignpattern.base.ManUser;

import java.lang.reflect.Proxy;


class IUserInvokeHandlerTest extends ProxyDesignPatternApplication {


    @Test
    public void testProxy() {
        IUserInvokeHandler invokeHandler = new IUserInvokeHandler(new ManUser());
        IUser proxy = invokeHandler.getProxy();
        proxy.say();
    }
}