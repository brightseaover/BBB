package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 *
 */
public class Test08 {
	public static void main(String[] args) throws ParseException {
		List list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<4;i++){
			System.out.println("请输入日期"+i+"(yyyy-MM-dd格式)：");
			String str=sc.nextLine();
			Date d=new SimpleDateFormat("yyyy-MM-dd").parse(str);
			list.add(d);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
