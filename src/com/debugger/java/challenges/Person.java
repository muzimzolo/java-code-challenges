package com.debugger.java.challenges;

/*
 * Create a person class with the following attributes:
 * fisrt name, last name,  age with getters and setters
 * Add functionality for introduction
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNname) {
		this.lastName = lastNname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void introduceYourself() {
        System.out.println("Hi, my name is " +
                this.firstName + " " + this.lastName +
                " and I'm " + this.age);
    }

}
