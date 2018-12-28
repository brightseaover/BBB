package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个email：");
		String str=sc.nextLine();
		System.out.println(getuser(str));
	}
	public static String getuser(String str) {
		return str.substring(0,str.indexOf("@"));
	}
}
