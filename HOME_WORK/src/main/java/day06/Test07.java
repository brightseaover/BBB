package day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要复制的文件名");
		String name=sc.nextLine();
		try {
			copy1(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 * @throws IOException 
	 */
	public static void copy1(String name) throws IOException{
		RandomAccessFile src=new RandomAccessFile(name, "r");
		String[] s=name.split(".");
		RandomAccessFile dsrc=new RandomAccessFile(s[0]+"_copy."+s[1], "rw");
		int d=-1;
		while((d=src.read())!=-1){
			dsrc.write(d);
		}
		src.close();
		dsrc.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 * @throws IOException 
	 */
	public static void copy2(String name) throws IOException{
		String[] s=name.split(".");
		RandomAccessFile src=new RandomAccessFile(name,"r");
		RandomAccessFile dsrc=new RandomAccessFile(s[0]+"_copy."+s[1], "rw");
		
		byte[] data=new byte[1024*10];
		int len=-1;
		while((len=src.read(data))!=-1){
			dsrc.write(data,0,len);
		}
		src.close();
		dsrc.close();
	}
}
