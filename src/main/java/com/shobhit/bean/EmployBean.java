package com.shobhit.bean;

public class EmployBean {
	private int id;
	private String name;
	private String designation;
	private int salary;

	public EmployBean() {
	}

	public EmployBean(int id, String name, String designation, int salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object object) {
		EmployBean employ = (EmployBean) object;

		return ((this.id == employ.id) && (this.name.equals(employ.name)) && (this.designation.equals(employ.designation)) && (this.salary == employ.salary));
	}

	@Override
	public String toString() {
		return "EmployBean [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
}