package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Xiloe
 *
 */
public class Test05 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入身份证号码：");
		String sd=sc.nextLine();
		String reg1="^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		String reg2="^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}[0-9Xx]$";
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
	if(sd.matches(reg1)){
		String str=sd.substring(6,14);
		date=sdf1.parse(str);
		
	}else if(sd.matches(reg2)){
		String str=sd.substring(6,12);
		date=sdf1.parse("19"+str);
	}else{
		System.out.println("格式有误，请重新输入！");
	}
		if(date!=null){
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.YEAR, 20);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			
			System.out.println("20岁生日当周周三为："+sdf2.format(cal.getTime()));
		}
	
	}
}
