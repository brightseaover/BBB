package day07;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名：");
		String name=sc.nextLine();
		RandomAccessFile raf1=new RandomAccessFile(name,"rw");
		RandomAccessFile raf2=new RandomAccessFile(name+"_utf.txt","rw");
		
		System.out.println("请输入文件内容：");
		while(true){
			String str=sc.nextLine();
			if("exit".equals(str)){
				break;
			}
			raf1.write(str.getBytes("gbk"));
		}
		byte[] data=new byte[(int) raf1.length()];
		raf1.read(data);
		String datas=new String(data,"utf-8");
		raf2.writeChars(datas);
		System.out.println("Work has finished");
		raf1.close();
		raf2.close();
	}
}
