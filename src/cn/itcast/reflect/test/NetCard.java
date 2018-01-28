package cn.itcast.reflect.test;

public class NetCard implements PCI{
	public void open() {
		System.out.println("net open ...");
	}
	
	public void close() {
		System.out.println("net close ...");
	}
}
