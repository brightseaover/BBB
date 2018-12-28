package day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Xiloer
 *
 */
public class Test10 {
	public static void main(String[] args) throws ParseException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工信息：");
		while(true){
			String info=sc.nextLine();
			if("exit".equals(info)){
				System.exit(0);
			}
			String[] infos=info.split(",");
			String name=infos[0];
			int age=Integer.parseInt(infos[1]);
			String gender=infos[2];
			int salary=Integer.parseInt(infos[3]);
			Date hiredate=new SimpleDateFormat("yyyy-MM-dd").parse(infos[4]);
			Emp emp=new Emp(name,age,gender,salary,hiredate);
			new RandomAccessFile(name+".emp","rw").write(emp.toString().getBytes("utf-8"));
			
		System.out.println("写入完毕，请输入下一个（输入完毕输exit）：");
		}
	}
	
}
