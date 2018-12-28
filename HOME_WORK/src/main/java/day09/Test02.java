package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Thread t1=new Thread(new P1());
		Thread t2=new Thread(new P2());
		t1.start();
		t2.start();
	}
}
class P1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("你好");
		}
		
	}
	
}
class P2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("再见");
		}
		
	}
	
}