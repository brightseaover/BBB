package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws ParseException {
		List <Emp> vc=new ArrayList<Emp>();
		Scanner sc=new Scanner(System.in);
		System.out.println("输入若干员工信息：");
		String info=sc.nextLine();
		String[] empinfo=info.split(";");
		for(int i=0;i<empinfo.length;i++){
			String[] empi=empinfo[i].split(",");
			String name=empi[0];
			Integer age=Integer.parseInt(empi[1]);
			String gender=empi[2];
			Integer salary=Integer.parseInt(empi[3]);
			Date hiredate=new SimpleDateFormat("yyyy-MM-dd").parse(empi[4]);
			vc.add(new Emp(name,age,gender,salary,hiredate));
		}
		Collections.sort(vc);
		System.out.println(vc);
		
		Collections.sort(vc,new Comparator(){

			public int compare(Object arg0, Object arg1) {
				Emp e1=(Emp)arg0;
				Emp e2=(Emp)arg1;
				return e2.getHiredate().getDate()-e1.getHiredate().getDate();
			}
			
		});
		
		System.out.println(vc);
	}
}
