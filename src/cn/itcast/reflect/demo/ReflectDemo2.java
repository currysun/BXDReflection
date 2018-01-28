package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
	/**
	 04-反射机制(获取Class中的构造函数)
	 * @throws Exception 
	 * @throws RuntimeException 
	 */
	public static void main(String[] args) throws RuntimeException, Exception {
		// TODO Auto-generated method stub
		createNewObject();
		//createNewObject_2();
		createNewObject_3();
	}
	public static void createNewObject() {
		cn.itcast.reflect.demo.Person p=new cn.itcast.reflect.demo.Person("green",28);
	}
	
	public static void createNewObject_2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//1定义需要创建实例化的 类名
		String classname="cn.itcast.reflect.demo.Person";
		//2寻找该名称的类文件，将其传入内存，并产生class对象
		//用Class.forname 创建该类的字节码文件对象
		Class clazz=Class.forName(classname);
		//3 Class 类的newInstance 实例化该对象
		Object object=clazz.newInstance();
		
	}
	public static void createNewObject_3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, RuntimeException {

		String classname="cn.itcast.reflect.demo.Person";

		Class clazz=Class.forName(classname);

		Constructor c=clazz.getConstructor(String.class,int.class);
		
		Object object=c.newInstance("curry",30);
		
		
		
	}

}
