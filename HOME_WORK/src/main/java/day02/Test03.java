package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入IP地址：");
		String str=sc.nextLine();
		getIP(str);
	}
	public  static void getIP(String str){
		String[] strs=str.split("\\.");
		for(String s:strs){
			System.out.println(s);
		}
	}
}
