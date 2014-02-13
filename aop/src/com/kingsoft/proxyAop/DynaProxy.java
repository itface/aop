package com.kingsoft.proxyAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DynaProxy implements InvocationHandler{

	private Object delegate;
	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(), this.delegate.getClass().getInterfaces(), this);
	}
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		Object result = null;
		try {
			 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 System.out.println(method.getName()+"方法的查询时间是："+sd.format(Calendar.getInstance().getTime()));
		     result = method.invoke(this.delegate, args);
		} catch (Exception e) {
		     e.printStackTrace();
		}
       return result;
	}

}
