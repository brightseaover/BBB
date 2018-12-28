package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String yzm=generate();
		System.out.println(yzm);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入验证码：");
		String str=sc.nextLine();
		if(str.equalsIgnoreCase(yzm)){
			System.out.println("验证成功");
		}else{
			System.out.println("验证失败");
		}
	}
	public static String generate(){
		Random ran=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<5;i++){
			char c=ran.nextInt(2)==0?(char)('A'+ran.nextInt(26)):(char)('a'+ran.nextInt(26));
			sb.append(c);
		}
		return sb.toString();
	}
}
