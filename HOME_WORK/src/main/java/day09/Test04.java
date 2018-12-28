package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					String str=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
					System.out.println(str);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}
}
