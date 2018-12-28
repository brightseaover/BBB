package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Xiloer
 *
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入若干员工信息：");
		String str=sc.nextLine();
		
		String[] s=str.split(";");
		Person[] p=new Person[s.length];
		for(int i=0;i<s.length;i++){
			String[] ss=s[i].split(",");
			String name=ss[0];
			int age=Integer.parseInt(ss[1]);
			String gender=ss[2];
			int salary=Integer.parseInt(ss[3]);
			p[i]=new Person(name,age,gender,salary);
		}
		for(Person pe:p){
			System.out.println(pe.toString());
		}
	}
}
