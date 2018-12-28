package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入出生日期：");
		String sd=sc.nextLine();
		long b=new SimpleDateFormat("yyyy-MM-dd").parse(sd).getTime();
		long l=new Date().getTime();
		long week=(l-b)/(7*24*60*60*1000);
		System.out.println(week);
	}
}
