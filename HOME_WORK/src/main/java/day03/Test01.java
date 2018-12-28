package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		long l=date.getTime()+3*24*60*60*1000;
		date=new Date(l);
		System.out.println(date);
	}
}
