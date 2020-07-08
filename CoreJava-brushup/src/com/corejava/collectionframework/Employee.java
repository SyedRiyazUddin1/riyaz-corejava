package com.corejava.collectionframework;

public class Employee {

	private Integer id;
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public boolean equals(Object o) {
		System.out.println("In equals " + "value is :" + this.id);
		Employee employee = (Employee) o;
		if (employee.getName().equals(this.id)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode " + "value is :" + this.id);
		int hash = 3;
		hash = 7 * hash + this.id.hashCode();
		return hash;
	}
}
