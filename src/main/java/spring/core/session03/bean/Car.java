package spring.core.session03.bean;

public class Car {
	private String name;
	private Integer price;
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Car(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Car() {
		super();
	}
	
	
	
	
	
}
