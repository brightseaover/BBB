package day04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Xiloer
 *
 */
public class Test09 {
	public static void main(String[] args) {
		List <Emp> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工信息：");
		String str=sc.nextLine();
		String[] strs=str.split(";");
		for(int i=0;i<strs.length;i++){
			String [] s=strs[i].split(",");
			try{
			String name=s[0];
			int age=Integer.parseInt(s[1]);
			String gender=s[2];
			int salary=Integer.parseInt(s[3]);
			Date date=new SimpleDateFormat("yyyy-MM-dd").parse(s[4]);
			list.add(new Emp(name,age,gender,salary,date));
			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		List <Date> dates=new ArrayList<Date>();
		for(Emp e:list){
			Date d=e.getHiredate();
			Calendar cal=Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.MONTH, 3);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			d=cal.getTime();
			dates.add(d);
			System.out.println(e.toString());
		}
		System.out.println(dates);
	}
}
