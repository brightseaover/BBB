package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		new T1().start();
		new T2().start();
	}
}
class T1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你好");
		}
	}
}
class T2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("再见");
		}
	}
}