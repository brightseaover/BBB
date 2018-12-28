package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串");
		String str=sc.nextLine();
		check(str);
	}
	public static void check(String str){
		String reg1="[\\d]+";
		String reg2="[\\d]+[\\.][\\d]+";
		if(str.matches(reg1)){
			int t=Integer.parseInt(str);
			System.out.println("结果是："+t*10);
		}else if(str.matches(reg2)){
			double d=Double.parseDouble(str);
			System.out.println("结果是："+d*5);
		}else{
			System.out.println("不是数字");
		}
	}
}
