package session04;

import spring.core.session04.proxy.sta.Child;
import spring.core.session04.proxy.sta.Man;
import spring.core.session04.proxy.sta.Person;
import spring.core.session04.proxy.sta.PersonProxy;
import spring.core.session04.proxy.sta.Woman;

public class ProxyStaticDemo {
	public static void main(String[] args) {
//		Person man = new Man();
//		Person woman = new Woman();
//		man.work();
//		woman.work();
		Person man = new PersonProxy(new Man());
		Person woman = new PersonProxy(new Woman());
		Person child = new PersonProxy(new Child());
		man.work();
		woman.work();
		child.work();
	}
}
