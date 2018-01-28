package cn.itcast.reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		reflectMethod();
		reflectMethod_1();
		reflectMethod_2();
	}
	
	public static void reflectMethod_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String className="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(className);
		Method method=clazz.getMethod("paraMethod", String.class,int.class);
		Object obj=clazz.newInstance();
		method.invoke(obj, "thomphson",28);
	}

	public static void reflectMethod_1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String className="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(className);
		Method method=clazz.getMethod("show", null);
		Object obj=clazz.newInstance();
		method.invoke(obj, null);
		/*Person p=new Person();
		p.show();*/
	}

	/*
	 * 获取指定Class中的公共函数
	 */
	
	public static void reflectMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(className);
		//Method[] methods =clazz.getMethods(); //获取字节码文件对象中公有的方法，同理getField。包含父类的方法。
		Method[] methods =clazz.getDeclaredMethods(); //获取本类中所有的方法，同理getDeclaredField。不包含父类的方法。
		for(Method method: methods) {
			System.out.println(method);
		}
		
		//clazz.newInstance();
	}

}
