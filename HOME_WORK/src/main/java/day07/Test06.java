package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名");
		String name=sc.nextLine();
		
		FileOutputStream fos=new FileOutputStream(name,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
		PrintWriter pw=new PrintWriter(osw,true);
		System.out.println("请输入内容：");
		while(true){
			String str=sc.nextLine();
			if("exit".equalsIgnoreCase(str)){
				break;
			}
			pw.println(str);
		}
		pw.close();
	}
}
