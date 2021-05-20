package org.meiqin.proxydesignpattern.cglib;

import org.junit.jupiter.api.Test;
import org.meiqin.proxydesignpattern.ProxyDesignPatternApplication;
import org.meiqin.proxydesignpattern.base.IUser;
import org.meiqin.proxydesignpattern.base.ManUser;
import org.springframework.cglib.proxy.Enhancer;

import static org.junit.jupiter.api.Assertions.*;

class ManUserInterceptorTest extends ProxyDesignPatternApplication {

    @Test
    public void testProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ManUser.class);
        enhancer.setCallback(new ManUserInterceptor());
        ManUser proxy = (ManUser) enhancer.create();
        proxy.say();


    }

}