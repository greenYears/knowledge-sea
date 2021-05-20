package org.meiqin.proxydesignpattern.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p/>
 * ManUserInterceptor
 *
 * @author zichuan.zhou91@gmail.com
 * @date 2021/5/20
 */
public class ManUserInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib前置处理");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib后置处理");
        return invoke;
    }
}
