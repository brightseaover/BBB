package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis=new FileInputStream("myfile.txt");
			fos=new FileOutputStream("myfile_c.txt");
			int d=-1;
			while((d=fis.read())!=-1){
				fos.write(d);
			}
			System.out.println("任务执行完毕");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
