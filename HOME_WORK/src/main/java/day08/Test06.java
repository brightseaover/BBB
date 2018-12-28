package day08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 * 
 * @author Xiloer
 *
 */
public class Test06 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		File file = null;
		file = new File("src/main/java/day08/emp.txt");
		PrintWriter pw=null;
		while(true){
			System.out.println("请输入员工信息：");
		    String str=sc.nextLine();
		if("exit".equals(str)){
			System.exit(0);
		}
		try{
			FileOutputStream fos=new FileOutputStream(file,true);
			pw=new PrintWriter(fos,true);
			String[]s=str.split(",");
			int age=Integer.parseInt(s[1]);
			boolean b=s[0].matches("[a-zA-Z]{1,20}")&&s[2].matches("[男女]")
					&&age>=0&&age<=100;
			System.out.println(b);
			if(b){
				pw.println(str);
				System.out.println("写出完毕");
			}else{
				System.out.println("输入有误，请重新输入");
			}
		}catch(Exception e){
			System.out.println("输入的员工信息格式有误");
		}finally{
			pw.close();
		}
		}
	}
}
