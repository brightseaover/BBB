package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Xiloer
 *
 */
public class Test12 {
	public static void main(String[] args) throws IOException, ParseException {
		Map<String,Emp> empMap=new HashMap<String,Emp>();
		File[] files=new File(".").listFiles(f->f.getName().endsWith(".emp"));
		for(File f:files){
			FileInputStream fis=new FileInputStream(f);
			byte[] data=new byte[200];
			fis.read(data);
			String str=new String(data).trim();
			String[] strs=str.split(",");
			String name=strs[0];
			int age=Integer.parseInt(strs[1]);
			String gender=strs[2];
			int salary=Integer.parseInt(strs[3]);
			Date date=new SimpleDateFormat("yyyy-MM-dd").parse(strs[4]);
			empMap.put(name, new Emp(name,age,gender,salary,date));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查找的员工姓名：");
		String name=sc.nextLine();
		if(empMap.get(name)==null){
			System.out.println("查无此人");
		}else{
			Emp emp=empMap.get(name);
			Date date=emp.getHiredate();
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.YEAR, 20);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
			date=cal.getTime();
			String dates=new SimpleDateFormat("yyyy-MM-dd").format(date);
			System.out.println(emp.getName()+","+emp.getAge()+","+emp.getSalary()+","+dates);
		}
	}
}
