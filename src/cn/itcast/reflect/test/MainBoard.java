package cn.itcast.reflect.test;

public class MainBoard {
	
	public void run() {
		System.out.println("MainBoard run... ");
	}
	
	//��չ�Բ�����ʱ ����Ӹ������أ���Ҫ���������һ������
	//��Щ��Ҫ�Ĺ����Ǻ����ģ��������ʼʱ ��ô֪��������Ҫʲô�أ�
	public void useSound(SoundCard s) {
		s.open();
		s.close();
		
	}
	//��ʱ��������һ������ ���⹫��������� Ҳ���ǽӿ�
	public void usePCI(PCI p) {
		if(p!=null) {
			p.open();
			p.close();
		}
	}
}
