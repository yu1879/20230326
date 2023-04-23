package spring.core.session04.proxy.sta;

public class PersonProxy implements Person {
	private Person person;

	public PersonProxy(Person person) {
		this.person = person;
	}

	@Override
	public void work() {
		System.out.println("出門戴口罩");
		try {
					person.work();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
			System.out.println("去買口罩");
			System.out.println("將口罩戴回");
		}
		
		System.out.println("回家脫口罩");
	}

}
