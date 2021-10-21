package com.debugger.java.challenges;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Mckenzy", 38);
		Person p2 = new Person("Pablo", "El Picasso", 29);
		Person p3 = new Person("Henry", "Nickhounam", 17);

		p1.introduceYourself();
		p2.introduceYourself();
		p3.introduceYourself();

	}
}