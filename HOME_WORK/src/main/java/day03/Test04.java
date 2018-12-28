package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入出厂日期：");
		String sd=sc.nextLine();
		System.out.println("请输入保质期：");
		int day=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(sd);
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, day);
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		date=cal.getTime();
		System.out.println("促销日期为："+sdf.format(date));
	}
}
