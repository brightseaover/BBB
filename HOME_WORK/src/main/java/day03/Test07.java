package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) throws ParseException {
		List <Emp> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要输入的员工数量：");
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"个员工信息：");
			String str=sc.nextLine();
			String[] s=str.split(",");
			String name=s[0];
			int age=Integer.parseInt(s[1]);
			String gender=s[2];
			int salary=Integer.parseInt(s[3]);
			Date date=new SimpleDateFormat("yyyy-MM-dd").parse(s[4]);
			
			Emp emp=new Emp(name,age,gender,salary,date);
			if(!list.contains(emp)){
				list.add(emp);
			}else{
				System.out.println("该员工已存在");
			}
		}
		System.out.println(list);
	}
}
