package cn.itcast.reflect.demo;

public class Person {

	String name;
	public int age;
	
	public Person() {
		System.out.println("person run..");
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("person parameters run.."+name+":"+age);
	}
	
	public void show() {
		System.out.println("person show");
	}
	
	public static void display() {
		System.out.println("person static method ");
	}
	
	public void paraMethod(String name,int age) {
		System.out.println(name+" person parameter method "+age);
	}
	
	private void method() {
		System.out.println("person method private");
	}

}
