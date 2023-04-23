package spring.core.session04.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynProxy {
	private Object object;

	public DynProxy(Object object) {
		this.object = object;
	}

	public Object getProxy() {
		Object proxyObj = null;
		ClassLoader loader = object.getClass().getClassLoader();
		Class<?>[] interfaces = object.getClass().getInterfaces();
		InvocationHandler handler = (Object proxy, Method method, Object[] args) -> {
			Object result = null;
			MyLogger.before();
			try {
				result = method.invoke(object, args);

			} catch (Exception e) {
				MyLogger.throwing();
			} finally {

				MyLogger.end();
			}
			return result;
		};
		proxyObj = Proxy.newProxyInstance(loader, interfaces, (InvocationHandler) handler);
		return proxyObj;
	}
}
