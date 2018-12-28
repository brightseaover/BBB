package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入电话号码：");
		String str=sc.nextLine();
		if(isPhone(str)){
			System.out.println("输入正确！");
		}else{
			System.out.println("输入有误，请重新输入");
		}
	}
	public  static boolean isPhone(String str){
		String reg="[\\d]{3,4}-[\\d]{7,8}";
		return str.matches(reg);
	}
}
