package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入计算表达式：");
		String str=sc.nextLine();
		System.out.println("计算结果是："+result(str));
	}
	public static double result(String str){
		String reg="[\\+\\-\\*\\/]";
		String[] s=str.split(reg);
		double d1=Double.parseDouble(s[0]);
		double d2=Double.parseDouble(s[1]);
		char c=str.charAt(s[0].length());
		double d=0;
		switch(c){
		case '+':d=d1+d2;break;
		case '-':d=d1-d2;break;
		case '*':d=d1*d2;break;
		case '/':d=d1/d2;break;
		}
		return d;
	}
}
