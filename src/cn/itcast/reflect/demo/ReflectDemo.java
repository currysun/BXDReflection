package cn.itcast.reflect.demo;

public class ReflectDemo {
	
	/*
	 * ����ǰ�����Ȼ�� �ֽ����ļ�����.class��
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//getClassObject_1();
		//getClassObject_2();
		getClassObject_3();
	}
	
	/*
	 * 3.ʹ��Class ���е�forClass(�ֽ����ļ�ȫ��)
	 */
	
	public static void getClassObject_3() throws ClassNotFoundException {
		String classname="cn.itcast.reflect.demo.Person";
		Class clazz=Class.forName(classname);
		System.out.println(clazz);
	}
	
	/*
	 * 2.Object ���еľ�̬��̬����.class
	 * ��չ�Ի��ǲ�����
	 */
	
	public static void getClassObject_2() {
		Class clazz=Person.class;
		Class clazz1=Person.class;
		System.out.println(clazz==clazz1);
	}
	
	/*
	 * ���ֻ�ȡ�ֽ������ķ�ʽ��
	 * 1.Object ���е�getClass ����
	 */
	
	public static void getClassObject_1() {
		Person p=new Person();
		Class clazz=p.getClass();
		Class clazz1=p.getClass();
		System.out.println(clazz==clazz1);
	}
}
