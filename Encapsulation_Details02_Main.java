package com.encapsulation01;

public class Encapsulation_Details02_Main {

	public static void main(String[] args) {
		
		System.out.println("Create an Object For Employee 01 :------------------------");
		
		Encapsulation_Details01 emp01 = new Encapsulation_Details01();
		emp01.setName("Huzefa");
		System.out.println("Name is :" + emp01.getName());
		
		emp01.setAge(23);
		System.out.println("Age is :" + emp01.getAge());
		
		emp01.setGender('M');
		System.out.println("Gender is :" + emp01.getGender());
		
		System.out.println("Create an Object For Employee 02 :------------------------");
		
		Encapsulation_Details01 emp02 = new Encapsulation_Details01();
		emp02.setName("Priyanka");
		System.out.println("Name is :" + emp02.getName());
		
		emp02.setAge(31);
		System.out.println("Age is :" + emp02.getAge());
		
		emp02.setGender('F');
		System.out.println("Gender is :" + emp02.getGender());
	}

}
