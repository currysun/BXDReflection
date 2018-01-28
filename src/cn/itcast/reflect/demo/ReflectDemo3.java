package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		reflectField();
	}
	
	public static void reflectField() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		String classname="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(classname);
		Object obj=clazz.newInstance();
		//Field field=  clazz.getField("age");  //getField 只能获取公共字段，包含父类的字段
		Field field=clazz.getDeclaredField("age"); //getDeclaredField 可以获取本类包括私有，默认字段	。不包含父类的字段
		field.set(obj, 66);
		Object fObject =field.get(obj);
		System.out.println(fObject);
	}
}
