package cn.itcast.reflect.test;

public class SoundCard implements PCI{

	public void open() {
		System.out.println("sound card start ...");
	}
	
	public void close() {
		System.out.println("sound card close ...");
	}

}
