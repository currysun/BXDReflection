package cn.itcast.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {
	/*
	 * 电脑运行 案例
	 * 以前都是主动new 去找class。反射是拿着class 自己研究
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		MainBoard mb=new MainBoard();
		mb.run();
		/*
		 * 后期想扩展功能，比如听音乐 SoundCard,
		 * 最笨的方法是写一个SoundCard 类，在MainBoard上将SoundCard 传递进来。 
		mb.useSound(new SoundCard());
		*/
		
		/*虽然使用多态 （子类实现接口的功能） 可以提高扩展性
		 * mb.usePCI(new SoundCard());
		 *但能不能不修改代码来完成这个动作。
		 *不用new 对象来完成，而只获取其class文件。在内部实现创建对象的动作。 
		*/
		File configFile=new File("pci.properties");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(configFile);
		prop.load(fis);
		
		for (int i = 0; i < prop.size(); i++) {
			
			String pciname=prop.getProperty("pci"+(i+1));
			
			Class clazz=Class.forName(pciname); //用Class 类加载这个pci子类
			
			PCI p=(PCI)clazz.newInstance();
			
			mb.usePCI(p);
		}
		fis.close();
		
	}
	

}
