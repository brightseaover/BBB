package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("myfile.txt");
		FileOutputStream fos=new FileOutputStream("myfile_cp.txt");
		int d=-1;
		while((d=fis.read())!=-1){
			fos.write(d);
		}
		System.out.println("Copy Over！");
		fis.close();
		fos.close();
	}
}
