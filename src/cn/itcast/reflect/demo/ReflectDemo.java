package cn.itcast.reflect.demo;

public class ReflectDemo {
	
	/*
	 * 反射前必须先获得 字节码文件对象（.class）
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//getClassObject_1();
		//getClassObject_2();
		getClassObject_3();
	}
	
	/*
	 * 3.使用Class 类中的forClass(字节码文件全名)
	 */
	
	public static void getClassObject_3() throws ClassNotFoundException {
		String classname="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(classname);
		System.out.println(clazz);
	}
	
	/*
	 * 2.Object 类中的静态静态属性.class
	 * 扩展性还是不够。
	 */
	
	public static void getClassObject_2() {
		Class clazz=Person.class;
		Class clazz1=Person.class;
		System.out.println(clazz==clazz1);
	}
	
	/*
	 * 三种获取字节码对象的方式。
	 * 1.Object 类中的getClass 方法
	 */
	
	public static void getClassObject_1() {
		Person p=new Person();
		Class clazz=p.getClass();
		Class clazz1=p.getClass();
		System.out.println(clazz==clazz1);
	}
}
