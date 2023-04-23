package spring.core.session04.proxy.sta;

public class Man implements Person {

	@Override
	public void work() {
		// System.out.println("出門戴口罩");
		System.out.println(getClass().getSimpleName() + "上班工作");
		// System.out.println("回家脫口罩");
	}

}
