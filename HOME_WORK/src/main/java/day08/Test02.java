package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		FileOutputStream fos;
		OutputStreamWriter osw;
		PrintWriter pw = null;
		try {
			fos=new FileOutputStream("note.txt");
			osw = new OutputStreamWriter(fos,"GBK");
			pw=new PrintWriter(osw,true);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入......");
		while(true){
			String str=sc.nextLine();
			if("exit".equals(str)){
				break;
			}
			pw.println(str);
		}
		System.out.println("任务执行完毕");
		pw.close();sc.close();
	}
}
