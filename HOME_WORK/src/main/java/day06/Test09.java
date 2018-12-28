package day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Xiloer
 *
 */
public class Test09 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("note.txt","rw");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入：");
		while(true){
			String str=sc.nextLine();
			if("exit".equals(str)){
				break;
			}
			raf.write(str.getBytes());
			raf.write(13);
			raf.write(10);
			raf.seek(raf.length());
		}
		raf.close();
	}
}
