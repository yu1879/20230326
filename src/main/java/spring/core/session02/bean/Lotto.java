package spring.core.session02.bean;

import java.util.Random;

public class Lotto {
	private int number;

	public Lotto() {
		Random random = new Random();
		number = random.nextInt(100) + 1;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Lotto [number=" + number + "]";
	}

}
