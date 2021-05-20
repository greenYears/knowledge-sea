package org.meiqin.proxydesignpattern.jdk;

import org.meiqin.proxydesignpattern.base.IUser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p/>
 * IUserInvokeHandler
 *
 * @author zichuan.zhou91@gmail.com
 * @date 2021/5/20
 */
public class IUserInvokeHandler<T extends IUser> implements InvocationHandler {
    private T target;

    public IUserInvokeHandler(T target) {
        this.target = target;
    }

    public T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-- 动态代理前置处理 --");
        Object invoke = method.invoke(target, args);
        System.out.println("-- 动态后置前置处理 --");
        return invoke;
    }
}
