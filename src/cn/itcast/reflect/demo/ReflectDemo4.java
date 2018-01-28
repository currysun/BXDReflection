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
	 * ��ȡָ��Class�еĹ�������
	 */
	
	public static void reflectMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(className);
		//Method[] methods =clazz.getMethods(); //��ȡ�ֽ����ļ������й��еķ�����ͬ��getField����������ķ�����
		Method[] methods =clazz.getDeclaredMethods(); //��ȡ���������еķ�����ͬ��getDeclaredField������������ķ�����
		for(Method method: methods) {
			System.out.println(method);
		}
		
		//clazz.newInstance();
	}

}
