package com.collection.tree;

public class Person implements Comparable<Person>{
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private Integer id;
	private String lastName;
	private String firstName;
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person() {}
	

	public Person(Integer id, String lastName, String firstName, Integer age) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		int lastComp = lastName.compareTo(p.lastName);
		return (lastComp != 0 ? lastComp : firstName.compareTo(p.firstName));
	}

	@Override
	public int hashCode() {
		return 31 * lastName.hashCode() + firstName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		Person p = (Person) obj;
		return p.lastName.equals(lastName) && p.firstName.equals(firstName);
	}
	
	
	
}
