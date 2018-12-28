package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("myfile.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos=new FileOutputStream("myfile_cp2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int d=-1;
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("复制完毕");
		bis.close();
		bos.close();
	}
}
