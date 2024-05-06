package Lec_31;

public class Person {
	int age;
	String name;
	
	public void Intro_yourSelf() {
		
		System.out.println("My Name is "+ name +" and age is "+ age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
