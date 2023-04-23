package spring.core.session03.bean;

import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private Set<Clazz> clazzs;

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Clazz> getClazzs() {
		return clazzs;
	}

	public void setClazzs(Set<Clazz> clazzs) {
		this.clazzs = clazzs;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clazzs=" + clazzs + "]";
	}

}
