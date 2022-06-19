package com.vempalli.java8;

import java.util.List;

public class Java8 {
	public static void main(String[] args) {
		List<Person> list=List.of(
				new Person("Vempalli", Gender.MALE),
				new Person("Haritha", Gender.FEMALE),
				new Person("Samantha", Gender.FEMALE)

				);

		//	using java 8 Streams

		list.stream().filter(l->Gender.MALE.equals(l.getGender())).forEach(System.out::println);

		list.stream().filter(l->l.getName().contains("z")).forEach(System.out::println);
		Person p=new Person();
		p=null;
		System.gc();
		System.out.println("main method is done");
	}
	
}
class Person{
	private String name;
	private Gender gender;
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Person()
	{

	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	protected void finalize() throws Throwable {

		System.out.println("finlize method called");
	}

}
enum  Gender{
	MALE,FEMALE
}
