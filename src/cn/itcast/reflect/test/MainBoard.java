package cn.itcast.reflect.test;

public class MainBoard {
	
	public void run() {
		System.out.println("MainBoard run... ");
	}
	
	//扩展性差，如果这时 我想加个网卡呢？还要再主板里加一个方法
	//这些想要的功能是后来的，我们在最开始时 怎么知道后面需要什么呢？
	public void useSound(SoundCard s) {
		s.open();
		s.close();
		
	}
	//此时我们设置一个规则 对外公布这个规则 也就是接口
	public void usePCI(PCI p) {
		if(p!=null) {
			p.open();
			p.close();
		}
	}
}
