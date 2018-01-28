package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
	/**
	 04-�������(��ȡClass�еĹ��캯��)
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
		//1������Ҫ����ʵ������ ����
		String classname="cn.itcast.reflect.demo.Person";
		//2Ѱ�Ҹ����Ƶ����ļ������䴫���ڴ棬������class����
		//��Class.forname ����������ֽ����ļ�����
		Class clazz=Class.forName(classname);
		//3 Class ���newInstance ʵ�����ö���
		Object object=clazz.newInstance();
		
	}
	public static void createNewObject_3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, RuntimeException {

		String classname="cn.itcast.reflect.demo.Person";

		Class clazz=Class.forName(classname);

		Constructor c=clazz.getConstructor(String.class,int.class);
		
		Object object=c.newInstance("curry",30);
		
		
		
	}

}
