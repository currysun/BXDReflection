package cn.itcast.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {
	/*
	 * �������� ����
	 * ��ǰ��������new ȥ��class������������class �Լ��о�
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		MainBoard mb=new MainBoard();
		mb.run();
		/*
		 * ��������չ���ܣ����������� SoundCard,
		 * ��ķ�����дһ��SoundCard �࣬��MainBoard�Ͻ�SoundCard ���ݽ����� 
		mb.useSound(new SoundCard());
		*/
		
		/*��Ȼʹ�ö�̬ ������ʵ�ֽӿڵĹ��ܣ� ���������չ��
		 * mb.usePCI(new SoundCard());
		 *���ܲ��ܲ��޸Ĵ�����������������
		 *����new ��������ɣ���ֻ��ȡ��class�ļ������ڲ�ʵ�ִ�������Ķ����� 
		*/
		File configFile=new File("pci.properties");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(configFile);
		prop.load(fis);
		
		for (int i = 0; i < prop.size(); i++) {
			
			String pciname=prop.getProperty("pci"+(i+1));
			
			Class clazz=Class.forName(pciname); //��Class ��������pci����
			
			PCI p=(PCI)clazz.newInstance();
			
			mb.usePCI(p);
		}
		fis.close();
		
	}
	

}
